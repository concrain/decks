package track

import org.springframework.dao.DataIntegrityViolationException

class DriverController {

    static scaffold = Driver

    /*
    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [driverInstanceList: Driver.list(params), driverInstanceTotal: Driver.count()]
    }

    def create() {
        [driverInstance: new Driver(params)]
    }

    def save() {
        def driverInstance = new Driver(params)
        if (!driverInstance.save(flush: true)) {
            render(view: "create", model: [driverInstance: driverInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'driver.label', default: 'Driver'), driverInstance.id])
        redirect(action: "show", id: driverInstance.id)
    }

    def show(Long id) {
        def driverInstance = Driver.get(id)
        if (!driverInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'driver.label', default: 'Driver'), id])
            redirect(action: "list")
            return
        }

        [driverInstance: driverInstance]
    }

    def edit(Long id) {
        def driverInstance = Driver.get(id)
        if (!driverInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'driver.label', default: 'Driver'), id])
            redirect(action: "list")
            return
        }

        [driverInstance: driverInstance]
    }

    def update(Long id, Long version) {
        def driverInstance = Driver.get(id)
        if (!driverInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'driver.label', default: 'Driver'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (driverInstance.version > version) {
                driverInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'driver.label', default: 'Driver')] as Object[],
                        "Another user has updated this Driver while you were editing")
                render(view: "edit", model: [driverInstance: driverInstance])
                return
            }
        }

        driverInstance.properties = params

        if (!driverInstance.save(flush: true)) {
            render(view: "edit", model: [driverInstance: driverInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'driver.label', default: 'Driver'), driverInstance.id])
        redirect(action: "show", id: driverInstance.id)
    }

    def delete(Long id) {
        def driverInstance = Driver.get(id)
        if (!driverInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'driver.label', default: 'Driver'), id])
            redirect(action: "list")
            return
        }

        try {
            driverInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'driver.label', default: 'Driver'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'driver.label', default: 'Driver'), id])
            redirect(action: "show", id: id)
        }
    }
    */
}
