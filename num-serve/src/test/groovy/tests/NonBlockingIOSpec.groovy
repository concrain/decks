package tests

import com.ning.http.client.AsyncCompletionHandler
import com.ning.http.client.AsyncHttpClient
import com.ning.http.client.Response
import ratpack.groovy.test.GroovyRatpackMainApplicationUnderTest
import spock.lang.Shared
import spock.lang.Specification
import util.DataSource
import util.Problem

/**
 * Created by rahul on 3/6/15.
 */
class NonBlockingIOSpec extends Specification {
  @Shared
  def aut = new GroovyRatpackMainApplicationUnderTest()

  def cleanup() {
    aut.stop()
  }

  def "test computing sums"() {
    given: "A client and an input file"
    def client = new AsyncHttpClient()
    def data = DataSource.reader

    expect: "Sums should match"
    data.lines().
        map {
          def problem = Problem.fromLine(it)
          def solution = new Solution(problem: problem, client: client)
          def f1 = client.
              prepareGet("${aut.address}num2").
              addQueryParam('lang', problem.left.lang).
              addQueryParam('text', problem.left.text).
              execute({ Response response ->
                solution.num1 = Integer.parseInt response.responseBody
                solution.eval()
              } as AsyncCompletionHandler)
          def f2 = client.
              prepareGet("${aut.address}num2").
              addQueryParam('lang', problem.left.lang).
              addQueryParam('text', problem.left.text).
              execute({ Response response ->
                solution.num2 = Integer.parseInt response.responseBody
                solution.eval()
              } as AsyncCompletionHandler)
          println "Submitted"
          [f1, f2]
        }.
        toArray().
        each {
          it[0].get()
          it[1].get()
        }
  }

  class Solution {
    Problem problem
    AsyncHttpClient client
    Integer num1
    Integer num2

    void eval() {
      if (num1 && num2) {
        def sum = num1 + num2
        client.
            prepareGet("${aut.address}text2").
            addQueryParam('lang', problem.expected.lang).
            addQueryParam('num', sum.toString()).
            execute({ Response response ->
              def actual = response.responseBody
              assert actual == problem.expected.text
            } as AsyncCompletionHandler)
      }
    }
  }

}
