package track

import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
class UserTests {

    void testSimpleConstraints() {
      mockForConstraintsTests(User)  // mock User domain class

      def badUser = new User(
          login: 'russel',
          password: 'nope',
          role: 'SuperUser'
        )
      // prove this is not a valid user
      assertFalse badUser.validate()
      assertEquals "inList", badUser.errors["role"]
    }

    void testUniqueConstraint() {
      def jdoe = new User(login: 'jdoe', password: 'pass', role: 'user')
      def admin = new User(login: 'admin', password: 'password', role: 'admin')
      jdoe.save(flush: true)
      admin.save(flush: true)
      mockDomain(User, [jdoe, admin])  // mock table with 2 users

      assertEquals 2, User.count()

      def goodUser = new User(login: 'good', password: 'password', role: 'user')
      goodUser.save(flush: true)
      assertEquals 3, User.count()
      assertNotNull User.findByLoginAndPassword('good', 'password')  // mockDomain gives you GORM dynamic finders
    }
}
