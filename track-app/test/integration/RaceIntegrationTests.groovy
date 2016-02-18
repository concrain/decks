import track.Race

/**
 * Created by russel on 4/19/14.
 */
class RaceIntegrationTests extends GroovyTestCase {

    void testRaceDatesBeforeToday() {
        def lastWeek = new Date() -7
        def race = new Race(startDate: lastWeek)

        assertFalse(race.validate())
    }
}
