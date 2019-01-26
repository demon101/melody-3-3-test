package melody

class IndexController {
    def testService

    def index() {
        Test.list()
        testService.serviceMethod()
        render "ok"
    }
}
