package track

/**
 * Created by russel on 6/14/14.
 */
class LoginTagLib {

  def loginControl = {
    if(request.getSession(false) && session.user){
      out << "Hello ${session.user.login} "
      out << """[${link(action: "logout", controller: "user"){"Logout"}}] """
    } else {
      out << """[${link(action: "login", controller: "user"){"Login"}}] """
    }
  }
}
