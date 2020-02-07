package com.main.kotlin

fun main() {
    val customerService = CustomerServiceKotlin()
    val productDao = ProductDaoKotlin()

    customerService.getCustomer(passportNumber)
        ?.lastPurchase()
        ?.let { p -> productDao.save(p) }
}