package tests

import groovyx.net.http.AsyncHTTPBuilder
import ratpack.groovy.test.GroovyRatpackMainApplicationUnderTest
import spock.lang.Shared
import spock.lang.Specification
import util.DataSource
import util.Problem

import java.util.concurrent.Executors
import java.util.concurrent.FutureTask

/**
 * Created by rahul on 3/6/15.
 */
class AsyncIOSpec extends Specification {

  @Shared
  def aut = new GroovyRatpackMainApplicationUnderTest()

  def cleanup() {
    aut.stop()
  }

  def "test computing sums"() {
    given: "A client and an input file"
    AsyncHTTPBuilder client = new AsyncHTTPBuilder(
        uri: aut.address,
        // contentType: ContentType.TEXT,
        // poolSize: 4,
    )
    def data = DataSource.reader
    def executor = Executors.newFixedThreadPool(4)

    expect: "Sums should match"
    data.lines().
        map {
          def problem = Problem.fromLine(it)
          FutureTask<Integer> f1 = client.get(path: "/num/${problem.left.lang}/${problem.left.text}") {
            Integer.valueOf it.entity.content.text
          }
          FutureTask<Integer> f2 = client.get(path: "/num/${problem.right.lang}/${problem.right.text}") {
            Integer.valueOf it.entity.content.text
          }
          println "Submitted"
          executor.submit({
            def sum = f1.get() + f2.get()
            client.get(path: "/text/${problem.expected.lang}/${sum}", {
              def actual = it.entity.content.text
              println "${actual} == ${problem.expected.text}"
              assert actual == problem.expected.text
              actual
            })
          })
        }.
        toArray().
        each {
          it.get()
        }
  }

}
