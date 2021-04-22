package com.validate

import grails.converters.JSON

class ValidateController {
    ValidateService validateService

    def validate() {
        def id = params.id
        render validateService.validateDetails(id) as JSON
    }

}
