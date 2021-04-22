package com.user

import groovyx.net.http.RESTClient

class UserController {
    UserService userService

    def products() {
        def products = userService.getProducts()
        [product: products]
    }

    def save() {
        def customerDetails = [
                prod_id       : Integer.parseInt(request.getParameter("prod_id")),
                name          : request.getParameter("name"),
                phone_no      : request.getParameter("phone_no"),
                city          : request.getParameter("city"),
                state         : request.getParameter("state"),
                credit_card_no: request.getParameter("card_no"),
                status        : "order placed"
        ]
        render userService.saveDetails(customerDetails)

    }

}