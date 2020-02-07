package com.main.kotlin


fun main() {
    val customerService = CustomerServiceKotlin()

    val customer: Customer? = customerService.getCustomer(passportNumber)
    val product: Product? = customer?.lastPurchase()

    val product1: Product? = customerService.getCustomer(passportNumber)?.lastPurchase()
    
}



