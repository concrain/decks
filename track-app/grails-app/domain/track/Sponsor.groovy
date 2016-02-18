package track

class Sponsor {

    String name
    BigDecimal amount
    String sponserType

    static constraints = {
        // validating (or constraining) the fields
        name(blank: false)
        sponserType(inList: ['Gold','Silver','Bronze','Affiliate'])
        amount(min: 1000.0)
    }

    // enforce cascading updates and deletes
    static belongsTo = [race: Race]
}
