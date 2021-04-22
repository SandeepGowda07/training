package com.validate

class ValidateService {
    def result

    def validateDetails(def id) {
        def c = Customer.get(id)
        Validate v = new Validate()
        v.setProperty("name", c.name)
        v.setProperty("phone_no", c.phone_no)
        v.setProperty("city", c.city)
        v.setProperty("state", c.state)
        v.setProperty("credit_card_no", c.credit_card_no)
        v.setProperty("status", c.status)
        if (v.validate()) {
            c.status = "order accepted"
            c.save(flush: true, failOnError: true)
            result = [validated: true]
        } else {
            c.status = "order Rejected"
            c.save(flush: true, failOnError: true)
            result = [validated: false]
        }
    }

}


