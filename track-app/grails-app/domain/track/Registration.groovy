package track

class Registration {

    Boolean paid
    String dateCreated = new Date().format('dd/MM/yyyy')

    static constraints = {
        // validating (or constraining) the fields
        race()
        driver()
        paid()
    }

    static mapping = {
        // mapping class names to alternate table names and field names to alternate column names
        autoTimestamp(false)
    }

    // enforce cascading updates and deletes
    static belongsTo = [race: Race, driver: Driver]

    def beforeInsert = {}
    def beforeUpdate = {}
    def beforeDelete = {}
    def onLoad = {}
}
