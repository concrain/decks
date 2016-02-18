/*
  investment odds are the estimated returns on money that is bet
  (potential size of pot, $) (probability of winning pot) / (potential loss, $) = investment odds 
  
  when investment odds are greater than 1.0 the play is favorable
*/

class PokerOdds  {

    def odds(size, prob, loss) {
        return (size*prob)/loss
    }
}


def poker = new PokerOdds()
poker.odds(100, 0.5, 20)