package com.product

class ProductService {
    def saveProduct(def prod) {
        Product product = new Product(prod)
        product.save(flush: true, failOnError: true)
        return product
    }

    def deleteProduct(def id) {
        def prod = Product.get(id)
        if (prod) {
            prod.delete()
            return [product: "Deleted Successfully"]
        } else {
            return [product: "Product not found"]
        }

    }

    def getProduct(def id) {
        def prod = Product.get(id)
        if (prod) {
            return prod
        } else {
            return [product: "Product not found"]
        }

    }

    def allProducts() {
        return Product.list()
    }
}
