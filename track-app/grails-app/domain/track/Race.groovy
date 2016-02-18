package track

class Race {

    String name
    Date startDate
    String city
    String state
    BigDecimal cost
    Integer maxRunners = 30
    Integer points
    BigDecimal distance

    /* function added to domain object */
    BigDecimal inMiles() {
        return distance * 0.6214
    }

    static searchable =  true  // enables the plugin on this class

    static constraints = {
        // validating (or constraining) the fields
        name(blank: false, maxSize: 50)
        points()
        startDate(validator: {return (it > new Date())})
        city()
        state(inList: ['CA','CO','TX','CH','NY'])
        distance(min: 40.0, max: 200.0)
        cost(min: 45.0, max: 300.0)
        maxRunners(min: 0, max: 50)
    }

    static mapping = {
        // mapping class names to alternate table names and field names to alternate column names
        sort "startDate"
    }

    static hasMany = [registrations: Registration, sponsors: Sponsor]

    String toString() {
        // overriding the toString method to make more useful
        return "${name}, ${startDate.format('MM/dd/yyyy')}"
    }
}
