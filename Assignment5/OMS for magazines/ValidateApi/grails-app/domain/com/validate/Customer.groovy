package com.validate

class Customer {
    int prod_id
    String name
    String phone_no
    String city
    String state
    String credit_card_no
    String status


    static mapping = {
        table 'order_details'
        id column:'cus_id',generator:'increment'
        version false
    }
}
