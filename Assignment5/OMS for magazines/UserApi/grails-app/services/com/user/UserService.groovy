package com.user

import groovyx.net.http.RESTClient

class UserService {
    def getProducts() {
        def restClient = new RESTClient('http://localhost:9020/allproducts')
        def resp = restClient.get(

                requestContentType: 'application/json'
        )
        def product = resp.getData()
        return product
    }

    def saveDetails(def customerDetails) {
        def rest = new RESTClient('http://localhost:9021/saveCustomer')
        def respDetails = rest.post(
                body: customerDetails,
                requestContentType: 'application/json'
        )
        return respDetails.getData().status
    }
}
