package com.product

import grails.databinding.BindingFormat

class Product {
    String name
    Long price
    @BindingFormat("dd/MM/yyyy")
    Date publish_date
    static constraints = {
        name nullable: true, blank: true
        price nullable: true, blank: true
        publish_date nullable: true, blank: true
    }
    static mapping = {
        table 'product'
        id column:'prod_id',generator:'increment'
        version false
    }
}
