package track

import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Race)
class RaceTests {

    void testInMiles() {
        def race = new Race(distance: 5.0)
        assert 3.107 == race.inMiles()
    }
}
