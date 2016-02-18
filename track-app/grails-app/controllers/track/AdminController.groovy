package track

class AdminController {

  def beforeInterceptor = [action:this.&auth]

  def auth() {   // controls the admin index
    if(!session.user) {
      redirect(controller:"user", action:"login")
      return false
    }
    if(!session.user.admin) {
      flash.message = "Permissions violation, admins only"
      redirect(controller:"race", action:"list")
      return false
    }
  }
  def index = {}
}
