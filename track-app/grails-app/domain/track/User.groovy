package track

class User {

    String login
    String password
    String role

    static constraints = {
        // validating (or constraining) the fields
        login(blank: false, nullable: false, unique: true)
        password(blank: false, password: true)
        role(inList: ["admin", "user"])
    }

  /* non persisted objects */
    static transients = ['admin']

    boolean isAdmin() {
      return role == "admin"
    }

    def beforeInsert = {
      password = password.encodeAsSHA()  // custom codec
    }

    String toString(){
        login
    }
}
