import grails.util.GrailsUtil
import track.Driver
import track.Race
import track.Registration
import track.Sponsor
import track.User

class BootStrap {

    def init = { servletContext ->

        switch (GrailsUtil.environment) {
            case "development":

            def russel = new Driver ( firstName: "Russel",
                                      lastName: "Arthur",
                                      gender: "M",
                                      dateOfBirth: (new Date () - 365 * 27),
                                      address: "1373 Flora Ave",
                                      city: "San Jose",
                                      state: "CA",
                                      zip: 95130,
                                      email: "concrain@gmail.com")
            russel.save (flush: true)
            if (russel.hasErrors ()) {
              println russel.errors
            }

            def CaliforniaRace = new Race (name: "Calicorn", city: "San Jose", state: "CA", cost: 120, maxRunners: 20, points: 4, distance: 40, startDate: (new Date () + 45))
              CaliforniaRace.save (flush: true)
            if (CaliforniaRace.hasErrors ()) {
              println CaliforniaRace.errors
            }

            def DenverRace = new Race (name: "Denver Nugget", city: "Denver", state: "CO", cost: 225, maxRunners: 35, points: 5, distance: 110, startDate: (new Date () + 85))
              DenverRace.save (flush: true)
            if (DenverRace.hasErrors ()) {
              println DenverRace.errors
            }

            def TexasRace = new Race (name: "Big America", city: "Austin", state: "TX", cost: 110, maxRunners: 40, points: 6, distance: 75, startDate: (new Date () + 115))
              TexasRace.save (flush: true)
            if (TexasRace.hasErrors ()) {
              println TexasRace.errors
            }

            def audi = new Sponsor ( race: CaliforniaRace, name: "Audi", amount: 40000, sponserType: "Gold")
            audi.save (flush: true)
            if (audi.hasErrors ()) {
              println audi.errors
            }

            def reg = new Registration (race: CaliforniaRace, driver: russel, paid: true, dateCreated: new Date ().format('dd/MM/yyyy'))
            reg.save ()
            if (reg.hasErrors ()) {
              print reg.errors
            }
            break

            case "production":
              /* optionally seed production data here */
            break
        }

        // user to test login security
        def admin = new User(login: "admin", password: "password", role: "admin")
        admin.save(flush: true)
        if(admin.hasErrors()) {
          println admin.errors
        }

        def laura = new User(login: "laura", password: "password", role: "user")
        laura.save(flush: true)
        if(laura.hasErrors()) {
          println laura.errors
        }
    }

    def destroy = {
    }
}
