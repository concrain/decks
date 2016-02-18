package util

import groovy.transform.Immutable

/**
 * Created by rahul on 3/6/15.
 */

@Immutable
class Problem {
  Integer id
  NumberText left
  NumberText right
  NumberText expected

  static Problem fromLine(String line) {
    def fields = line.split(',')
    int idx = 0
    new Problem(
        Integer.parseInt(fields[idx++]),
        new NumberText(fields[idx++],fields[idx++]),
        new NumberText(fields[idx++],fields[idx++]),
        new NumberText(fields[idx++],fields[idx++])
    )
  }
}
