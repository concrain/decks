class User {
   String name, email
    
    def createUser(name, email) {
       return [name: name, email: email]
    }

    String toString() {name: "${name}" email: "${email}"}
}

def user1 = new User()
user1.createUser('russel', 'mail@host.com').dump()
//user1.createUser('jon', 'gmail.com').inspect()




