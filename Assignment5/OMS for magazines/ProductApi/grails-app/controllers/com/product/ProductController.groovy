package com.product

import grails.converters.JSON

class ProductController {
    static allowedMethods = [saveProduct: ['POST'], deleteProduct: ['DELETE'], getProduct: ['GET'], allProducts: ['GET']]
    ProductService productService

    def saveProduct() {
        def prod = request.JSON
        render productService.saveProduct(prod) as JSON
    }

    def deleteProduct() {
        render productService.deleteProduct(params.id) as JSON

    }

    def getProduct() {
        render productService.getProduct(params.id) as JSON
    }

    def allProducts() {
        render productService.allProducts() as JSON
    }

}
