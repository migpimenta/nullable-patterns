package com.main.kotlin

val passportNumber = "ABC1234"

interface Customer {
    fun lastPurchase(): Product?

    fun getLoyaltyTier(): LoyaltyTier?
}

interface Product {
    fun getManufacturingYear(): Int
}

interface CustomerService {
    fun getCustomer(passportNumber: String): Customer?
}

interface ProductDao {
    fun save(product: Product)
}

class CustomerServiceKotlin: CustomerService {
    override fun getCustomer(passportNumber: String): Customer? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class ProductDaoKotlin: ProductDao {
    override fun save(product: Product) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

enum class LoyaltyTier {
    BASIC, SILVER, GOLD
}

