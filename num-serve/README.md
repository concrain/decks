NumServe
===

This project aims to help you understand when and why you must write non blocking code.

The problem
----

You've got a CSV file with two numbers written in a (potentially) different
languages. You need to compute the sum of these, and then return the sum
in a (potentially) third language.

An example would be

Id | Lang 1 | Num 1 | Lang 2 | Num 2 | Lang Out
---| ------ | ----- | ------ | ----- | --------
1  | en     | two   | fr     | trois | de

Here's how we process this

1. `two` in `en` is `2`.
2. `trois` in `fr` is `3`.
3. You need to compute the sum of these two numbers, i.e. `2+3 = 5`
4. Then you need to present this in `de`, i.e. `fünf`.

This problem suddenly appears more complicated than it should be. So to make
things simpler, we wrote in a microservice that can do these conversions for
us easier. That's all the code under `src/main` and `src/ratpack`.

All the code that demonstrates different kinds of clients is under
`src/test/groovy`. The test data is under `src/test/resources`.

In order for tests to be meaningful, we have an extra column.

Id | Lang 1 | Num 1 | Lang 2 | Num 2 | Lang Out | Expected
---| ------ | ----- | ------ | ----- | -------- | --------
1  | en     | two   | fr     | trois | de       | fünf

Getting started
---

First configure the IDE, then launch the webserver

```bash
./gradlew idea; ./gradlew run
```

Then launch your IDE and look at each of the test specs.

1. BlockingIOSpec

  This is the simplest possible approach to solving a problem. It appears to
  work very well, and offers very simple code. Run this test.

  However there are no latencies to deal with. So let's simulate some latency.
  If you look at `DelayLine`, it has a block of commented code. and only one
  line uncommented.

  Comment out that line, and uncomment the block that's been commented. Now
  rerun your test. You'll see it takes too long to complete. That's the result
  of using blocking IO. Often you do not see problems in your dev environment,
  but once you ship your app to production, network latencies start killing
  you.

2. ThreadsSpec

  This is a naïve approach to improving performance. And the worst thing about
  it is that for small data sets, it works. However if you throw a very large
  dataset at it, it blows up. That's because you can't launch so many threads.

  You must limit threads using a threadpool.

3. AsyncIOSpec

  This launches an asynchronous model with a threadpool. The callbacks occur
  in a threadpool. However the code has become significantly complex by now.
  It's not as simple as looking at the code and saying, "It takes 2 strings,
  converts them to numbers and then adds the 2 numbers and does something with
  the result".

  However the performance is no more as good as the case where we launched so
  many threads.

4. NonBlockingIOSpec

  This approach doesn't launch too many threads, but gives the same
  performance as the multiple threads case. It avoids having to launch threads
  by using a Non Blocking model.

  What this means is, you do not have to wait until you get a response from
  the server. You can register a callback, and not lose a thread at the same
  time.

  The price you pay for this, is your code is spread all over the place.

5. FunctionalSpec

  This approach takes us back to the BlockingSpec, but gives us functional code.

  While this by itself does not demonstrate the value of functional code, in the
  next spec, we'll get to see why functional code is so important.

6. RxJavaSpec

  This approach aims to get the same elegance as the BlockingIO case, while
  achieving the performance and model of the NonBlockingIo case.

  This is made possible by a library called RxJava. It takes a little while
  to understand how the `Observable`s work, but once you get the hang of it,
  it lets you write code as naturally as you would in the *Blocking* days.

TODO
---

1. Demonstrate Spring Reactor
2. Find out if GPars has support for making such code readable
