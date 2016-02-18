package track

class AdminFilters {

    def filters = {  // intercept requests on an application wide basis

        //all(controller:'*', action:'*') {  // default

        adminOnly(controller: '*', action: "(create|edit|update|save)") {   // everything except admin index
            before = {
              if(!session?.user?.admin){
                flash.message = "Permissions violation, admin only"
                redirect(controller: "race", action: "list")
                return false
              }
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
