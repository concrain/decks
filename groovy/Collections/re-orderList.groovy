
class OrderList {
    List input = []
    
    def move(newInput) {
        input[0] = newInput[0]
        input[1] = newInput[1]
        input[2] = newInput[2]
        input[3] = newInput[3]
        input[4] = newInput[4]        
    } 
    
    def flip() {
        List temp = []
        temp.add(input[1])
        temp.add(input[0])
        temp.add(input[3])
        temp.add(input[2])
        
        input = temp
    }
    
    def reverse() {
        input = input.sort{ a,b -> b <=> a }
        input = input.sort{ c,d -> d <=> c }
    }
    
    def even = { input >>
       {it % 2 == 0 ? 'even' : 'odd'}
    }
}

//
def p = new OrderList(input: [1, 2, 3, 4, 5])
println p.input

p.move([5, 4, 3, 2, 1])
println p.input

p.flip()
println p.input

p.reverse()
println p.input

p.even
println p.input

