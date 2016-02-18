package com.typesafe.training.scalatrain

/**
 * Created by russel on 3/19/15.
 */

object Time {
  def fromMinutes(minutes: Int): Time = new Time(minutes / 60, minutes % 60)
}

case class Time(hours: Int =0, minutes: Int =0) extends Ordered[Time] {

  require(minutes >= 0 && minutes <= 59, "minutes must be in range 0..59")
  require(hours >= 0 && hours <= 23, "hours must be in range 0..23")

  def compare(that: Time): Int = asMinutes - that.asMinutes // trait method

  val asMinutes: Int = hours*60 + minutes                   // field

  def minus(that: Time): Int = asMinutes - that.asMinutes   // method call
  def -(that: Time): Int = minus(that)

  override val toString: String = f"$hours%02d:$minutes%02d"
}

