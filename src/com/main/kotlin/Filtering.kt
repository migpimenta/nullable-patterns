package com.main.kotlin

fun main() {
    val customerService = CustomerServiceKotlin()
    val productDao = ProductDaoKotlin()

    customerService.getCustomer(passportNumber)
        ?.lastPurchase()
        ?.takeIf{ p -> p.getManufacturingYear() > 2000 }
        ?.let {p -> productDao.save(p) }
}