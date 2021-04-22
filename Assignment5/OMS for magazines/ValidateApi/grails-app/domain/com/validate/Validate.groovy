package com.validate

class Validate {
    String name
    String phone_no
    String city
    String state
    String credit_card_no
    String status

    static constraints = {
        name(nullable:false,blank:false,matches: "[a-zA-Z]+")
        phone_no(nullable:false,blank:false,matches: "^[789][0-9]{9}")
        city (nullable:false,blank:false,matches: "[a-zA-Z]+")
        state (nullable:false,blank:false,matches: "[a-zA-Z]+")
        credit_card_no (nullable:false,blank:false,matches: "[0-9]{16}")

    }
    static mapping = {
        table 'order_details'
        id column:'cus_id',generator:'increment'
        version false
    }
}
