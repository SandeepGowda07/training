package com.order

import groovyx.net.http.RESTClient

class OrderService {
    def saveCustomer(def cus) {
        Customer c = new Customer(cus)
        c.save(flush: true, failOnError: true)
        def rest1 = new RESTClient('http://localhost:8181/validate/')
        def respDetails1 = rest1.get(
                path: c.id,
                requestContentType: 'application/json'
        )
        def result = respDetails1.getData().validated as boolean
        if (result) {
            return [status: "Order Placed Successfully"]
        } else {
            return [status: "Order rejected due to invalid details"]
        }
    }
}
