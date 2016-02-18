package track



import org.junit.*
import grails.test.mixin.*

@TestFor(DriverController)
@Mock(Driver)
class DriverControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/driver/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.driverInstanceList.size() == 0
        assert model.driverInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.driverInstance != null
    }

    void testSave() {
        controller.save()

        assert model.driverInstance != null
        assert view == '/driver/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/driver/show/1'
        assert controller.flash.message != null
        assert Driver.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/driver/list'

        populateValidParams(params)
        def driver = new Driver(params)

        assert driver.save() != null

        params.id = driver.id

        def model = controller.show()

        assert model.driverInstance == driver
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/driver/list'

        populateValidParams(params)
        def driver = new Driver(params)

        assert driver.save() != null

        params.id = driver.id

        def model = controller.edit()

        assert model.driverInstance == driver
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/driver/list'

        response.reset()

        populateValidParams(params)
        def driver = new Driver(params)

        assert driver.save() != null

        // test invalid parameters in update
        params.id = driver.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/driver/edit"
        assert model.driverInstance != null

        driver.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/driver/show/$driver.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        driver.clearErrors()

        populateValidParams(params)
        params.id = driver.id
        params.version = -1
        controller.update()

        assert view == "/driver/edit"
        assert model.driverInstance != null
        assert model.driverInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/driver/list'

        response.reset()

        populateValidParams(params)
        def driver = new Driver(params)

        assert driver.save() != null
        assert Driver.count() == 1

        params.id = driver.id

        controller.delete()

        assert Driver.count() == 0
        assert Driver.get(driver.id) == null
        assert response.redirectedUrl == '/driver/list'
    }
}
