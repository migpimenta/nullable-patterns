package com.main.kotlin

fun main() {
    val customerService = CustomerServiceKotlin()


    val tier: LoyaltyTier = customerService.getCustomer(passportNumber)?.getLoyaltyTier() ?: LoyaltyTier.BASIC
}