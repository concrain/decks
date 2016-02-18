package numserve

import ratpack.handling.Context

import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

/**
 * Created by rahulsomasunderam on 04/03/15.
 */
@Singleton
class DelayLine {

  def se = Executors.newScheduledThreadPool(10)
  def rand = new Random()

  void render(Context context, String value) {

    /*
    def delay = 1000 + rand.nextInt(3000)
    context.promise {promise ->
      se.schedule({
        promise.success(value)
      }, delay, TimeUnit.MILLISECONDS)
    }.then { val ->
      context.render(val)
    } */

    context.render(value)

  }
}
