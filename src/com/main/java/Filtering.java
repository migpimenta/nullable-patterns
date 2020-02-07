package com.main.java;

import com.main.kotlin.Customer;
import com.main.kotlin.Product;
import com.main.kotlin.ProductDao;
import com.main.kotlin.ProductDaoKotlin;

public class Filtering {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerServiceJava();
        ProductDao productDao = new ProductDaoKotlin();

        String passportNumber = "";

        customerService.getCustomer(passportNumber)
                .map(Customer::lastPurchase)
                .filter(p -> p.getManufacturingYear() > 2000)
                .ifPresent(productDao::save);
    }
}
