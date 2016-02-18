package util

import groovy.transform.stc.ClosureParams

import java.util.stream.Stream

/**
 * Created by rahulsomasunderam on 28/03/15.
 */
class ZipSupport {
  static <A,B,C> Stream<A> zip(Stream<B> object, Stream<C> other, Closure<A> c) {
    def iter1 = object.iterator()
    def iter2 = other.iterator()
    def builder = Stream.builder()
    while (iter1.hasNext() && iter2.hasNext()) {
      builder.add c(iter1.next(), iter2.next())
    }
    builder.build()
  }
}
