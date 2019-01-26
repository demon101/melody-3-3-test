package melody

class BootStrap {

    def init = { servletContext ->

        new Test().save(failOnError:true)
        new Test().save(failOnError:true)
        new Test().save(failOnError:true)
        new Test().save(failOnError:true)
    }
    def destroy = {
    }
}
