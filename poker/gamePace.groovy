/*
    Game Pace =
    determined by comparing the betting done on various hands to the betting normally done on these hands
    
    Betting Pace = (hand pace)  
    determined by comparing the extent of betting, calling, raising, and bluffing to the size of the pot
    
    The good player controls his offensive and defensive game by altering his betting pace at various phases of a poker hand
    .7 = FAST
    .2 = SLOW
*/

class Pace {

    def open(openingBet, numCallers, pot) { 
         BigDecimal o = (openingBet * numCallers) / pot
         o = Math.round(o * 100) / 100
         println o
         return o
    }
    
    def raise(raiseBet, numCallers, pot) {
        BigDecimal r = (raiseBet * numCallers) / pot
        r = Math.round(r * 100) / 100
        println r
        return r
    }
    
    def finalBet(lastBet, numCallers, pot) {
        BigDecimal f = (lastBet * numCallers) / pot
        f = Math.round(f * 100) / 100
        println f
        return f
    }
    
    def bluff(numBluffs, avgFinalCallers, handsPlayed) {
        BigDecimal b = (numBluffs * avgFinalCallers) / handsPlayed
        b = Math.round(b * 100) / 100
        println b
        return b
    }
}

def pace = new Pace()
pace.open(4, 4, 23)
pace.raise(5, 3, 38)
pace.finalBet(20, 2, 198)
pace.bluff(2, 1, 10)