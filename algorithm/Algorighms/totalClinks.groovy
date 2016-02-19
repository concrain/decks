[1,2,3].each {myList -> println myList}

// If n people are at a party and everyone clinks glasses with everybody else, how many clinks do you hear?
def totalClinks = 0
def partyPeople = 5
1.upto(partyPeople) { guestNumber ->
           clinksWithGuest = guestNumber-1
           totalClinks += clinksWithGuest           
       }   
println totalClinks 