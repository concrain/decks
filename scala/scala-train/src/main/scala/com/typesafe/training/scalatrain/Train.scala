package com.typesafe.training.scalatrain

/**
 * Created by russel on 3/19/15.
 */

import scala.collection.immutable.Seq  // Seq is not immutable by default

// case class used for domain objects
case class Train(info: TrainInfo, schedule: Seq[(Time, Station)]) {

  require(schedule.size > 1, "schedule must have at least two numbers")

  // initialize stations with schedule  ._2 = second value
  val stations: Seq[Station] = schedule.map(timeAndStation => timeAndStation._2)

  def timeAt(station: Station): Option[Time] =    // filter vs. find
    schedule.find(timeAndStation => timeAndStation._2 == station).map(timeAndStation => timeAndStation._1)

    /*
    schedule.filter(timeAndStation => timeAndStation._2 == station) match {
      case Seq((time, _)) => Some(time)
      case _ => None
    }
    */
}

abstract sealed class TrainInfo {
  def number: Int
}

case class RegionalExpress(number: Int) extends TrainInfo { }
case class InterCityExpress(number: Int, hasWifi: Boolean = false) extends TrainInfo { }
case class BavarianRegional(number: Int) extends TrainInfo { }


