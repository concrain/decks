package tests

import groovyx.net.http.HTTPBuilder
import ratpack.groovy.test.GroovyRatpackMainApplicationUnderTest
import spock.lang.Shared
import spock.lang.Specification
import util.DataSource
import util.Problem
import util.ZipSupport

import java.util.stream.Stream

/**
 * Created by rahulsomasunderam on 28/03/15.
 */
class FunctionalSpec extends Specification {
  @Shared
  def aut = new GroovyRatpackMainApplicationUnderTest()

  def cleanup() {
    aut.stop()
  }

  Stream<Integer> getNumber(HTTPBuilder client, String lang, String text) {
    [Integer.valueOf(client.get(path: "/num/${lang}/${text}").text)].stream()
  }

  Stream<String> getText(HTTPBuilder client, String lang, Integer num) {
    [client.get(path: "/text/${lang}/${num}").text as String].stream()
  }

  def "test computing sums"() {
    given: "A client and an input file"
    def client = new HTTPBuilder(aut.address)
    def lines = DataSource.lines.stream()

    expect: "Sums should match"
    use(ZipSupport) {
      lines.
          flatMap { line ->
            def problem = Problem.fromLine(line)
            def left = getNumber(client, problem.left.lang, problem.left.text)
            def right = getNumber(client, problem.right.lang, problem.right.text)
            left.
                zip(right, { a, b -> a + b }).
                flatMap { Integer sum ->
                  def sumString = getText(client, problem.expected.lang, sum)
                  sumString.map { ss -> [ss, problem] }
                }
          }.
          each { result, problem ->
            println "$result == ${problem.expected.text}"
            assert result == problem.expected.text
          }
    }


  }
}
