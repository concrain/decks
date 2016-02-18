package tests

import groovyx.net.http.HTTPBuilder
import ratpack.groovy.test.GroovyRatpackMainApplicationUnderTest
import spock.lang.Shared
import spock.lang.Specification
import sun.java2d.xr.MutableInteger
import util.DataSource
import util.Problem

/**
 * Created by rahul on 3/6/15.
 */
class ThreadsSpec extends Specification {

  @Shared
  def aut = new GroovyRatpackMainApplicationUnderTest()

  def cleanup() {
    aut.stop()
  }

  def "test computing sums"() {
    given: "A client and an input file"
    def data = DataSource.reader

    expect: "Sums should match"
    def threads = data.lines().
        map {
          def problem = Problem.fromLine(it)
          def num1 = new MutableInteger(0)
          def num2 = new MutableInteger(0)
          def t1 = new Thread() {
            @Override
            void run() {
              num1.value = Integer.parseInt new HTTPBuilder(aut.address).
                  get(path: "/num/${problem.left.lang}/${problem.left.text}").
                  text
              solution.eval()
            }
          }
          def t2 = new Thread() {
            @Override
            void run() {
              num2.value = Integer.parseInt new HTTPBuilder(aut.address).
                  get(path: "/num/${problem.right.lang}/${problem.right.text}").
                  text
              solution.eval()
            }
          }
          new Thread() {
            @Override
            void run() {
              t1.start()
              t2.start()
              t1.join()
              t2.join()
              def sum = num1.value + num2.value
              def actual = new HTTPBuilder(aut.address).
                  get(path: "/text/${problem.expected.lang}/${sum}").
                  text
              println "$actual == $problem.expected.text"
              assert actual == problem.expected.text
            }
          }
        }.
        toArray().toList()
    threads*.start()
    threads*.join()
  }

}
