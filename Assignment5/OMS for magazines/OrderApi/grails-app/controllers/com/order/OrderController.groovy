package com.order

import grails.converters.JSON
import groovyx.net.http.RESTClient

class OrderController {
    OrderService orderService

    def saveCustomer() {
        def cus = request.JSON
        render orderService.saveCustomer(cus) as JSON

    }
}






