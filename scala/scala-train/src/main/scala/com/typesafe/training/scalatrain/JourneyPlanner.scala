package com.typesafe.training.scalatrain

/**
 * Created by russel on 3/20/15.
 */
class JourneyPlanner(trains: Set[Train]) {

  // flatmap
  val stations: Set[Station] = trains.flatMap(train => train.stations)

  // filter
  def trainsAt(station: Station): Set[Train] = trains.filter(train => train.stations.contains(station))

  // for loop
  /*
  def stopsAt(station: Station): Set[(Time, Train)] =  // tupil [( )]
    for {
    train <- trains
    timeAndStation <- train.schedule if timeAndStation._2 == station  // filter
  } yield (timeAndStation._1, train)  // generator
  */
  def stopsAt(station: Station): Set[(Time, Train)] =  // tupil [( )]
    for {
      train <- trains
      (time, scheduleStation) <- train.schedule
      if scheduleStation == station
    } yield (time, train)  // generator

  def isShortTrip(from: Station, to: Station): Boolean =
    trains.exists(train => train.stations.dropWhile(s => s != from) match {
      case Seq(`from`, `to`, _*) => true
      //case `from` +: `to` +: _ => true
      case Seq(`from`, _, `to`, _*) => true
      //case `from` +: _ +: `to` +: _ => true
      case _ => false
    })

}
