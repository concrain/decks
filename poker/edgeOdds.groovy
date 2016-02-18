/**
  Edge Odds indecate the relative performance of a player in a poker game
  (average winnings/losses of player,$ * 100) / average winnings of the biggers winner, $
  
  Edge Odds are estimated for an average seven-man game
  10 games are sufficent to get accurate odds

  .3 = Weak 	
  .5 = Average
  .7 = Strong
*/

class EdgeOdds {

    def odds(winloss, biggestWinner) {
        return (winloss*100)/biggestWinner
    }
}

def edge = new EdgeOdds()
edge.odds(75, 150)