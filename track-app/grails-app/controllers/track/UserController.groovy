package track

import org.springframework.dao.DataIntegrityViolationException

class UserController {

    static scaffold = true

    def login = {}

    // Closures like logout, and authenticate are exposed out to the end user in the URL
    def logout = {
      flash.message = "Goodbye ${session.user.login}"
      session.user = null
      redirect(action: 'login')
    }

    def authenticate = {  // login.gsp calls this closure
      def user = User.findByLoginAndPassword(params.login, params.password.encodeAsSHA()) // call custom codec
      println("user= ${params.login} password= ${params.password}")

      /* Find the user and add to the Session Scope */
      if(user) {
        session.user = user
          session.foo = 'foo'                                               // add to session
          session.removeAttribute('foo')                                    // delete from session
          println("session= ${session.valueNames}")
        flash.message = "Hello ${user.login}"

        if(user.admin){                                                      // admin redirect
          redirect(controller: "admin", action: "index")
        } else {
          redirect(controller: 'race', action: 'list')
        }

      } else {
        flash.message = "Sorry, ${params.login}.  Please try again."
        redirect(action: 'login')
      }
    }

    def beforeInterceptor = [action: this.&debug]  // & is a method pointer

    // Methods like debug() are private and can only be called by other closures or methods in the class.
    def debug() {
      println "DEBUG: ${actionUri} called."
      println "DEBUG: ${params}"
      // moved this to AdminFilters
      //[action: this.&auth, except:['login', 'logout', 'authenticate']]    /* you can also use 'only:' vs 'except:' */
    }

  /*
    def auth() {
      if(!session.user) {
        redirect(controller: 'user', action: 'login')
        return false
      }

      if(!session.user.admin) {
        flash.message = "Admins Only!"
        redirect(controller: 'race', action: 'list')
        return false
      }
    }
  */
    def index() {
      redirect(action: "list", params: params)
    }

    /*
    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [userInstanceList: User.list(params), userInstanceTotal: User.count()]
    }

    def create() {
        [userInstance: new User(params)]
    }

    def save() {
        def userInstance = new User(params)
        if (!userInstance.save(flush: true)) {
            render(view: "create", model: [userInstance: userInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'user.label', default: 'User'), userInstance.id])
        redirect(action: "show", id: userInstance.id)
    }

    def show(Long id) {
        def userInstance = User.get(id)
        if (!userInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'user.label', default: 'User'), id])
            redirect(action: "list")
            return
        }

        [userInstance: userInstance]
    }

    def edit(Long id) {
        def userInstance = User.get(id)
        if (!userInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'user.label', default: 'User'), id])
            redirect(action: "list")
            return
        }

        [userInstance: userInstance]
    }

    def update(Long id, Long version) {
        def userInstance = User.get(id)
        if (!userInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'user.label', default: 'User'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (userInstance.version > version) {
                userInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'user.label', default: 'User')] as Object[],
                        "Another user has updated this User while you were editing")
                render(view: "edit", model: [userInstance: userInstance])
                return
            }
        }

        userInstance.properties = params

        if (!userInstance.save(flush: true)) {
            render(view: "edit", model: [userInstance: userInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'user.label', default: 'User'), userInstance.id])
        redirect(action: "show", id: userInstance.id)
    }

    def delete(Long id) {
        def userInstance = User.get(id)
        if (!userInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'user.label', default: 'User'), id])
            redirect(action: "list")
            return
        }

        try {
            userInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'user.label', default: 'User'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'user.label', default: 'User'), id])
            redirect(action: "show", id: id)
        }
    }
    */
}
