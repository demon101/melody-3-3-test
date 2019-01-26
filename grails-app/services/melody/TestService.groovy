package melody

import grails.gorm.transactions.Transactional

@Transactional
class TestService {

    def serviceMethod() {

        "ok"
    }
}
