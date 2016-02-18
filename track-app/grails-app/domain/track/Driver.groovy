package track

class Driver {

    String firstName
    String lastName
    Date dateOfBirth
    String gender
    String address
    String city
    String state
    String zip
    String email

    static constraints = {
        // validating (or constraining) the fields
        firstName(blank: false)
        lastName(blank: false)
        dateOfBirth()
        gender(inList: ['M', 'F'])
        address()
        city()
        state()
        zip()
        email(email: true)
    }

    static hasMany = [registrations: Registration]

    String toString() {
        // overriding the toString method to make more useful
        "${lastName} ${firstName} (${email})"
    }
}
