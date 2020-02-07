package com.main.java;

import com.main.kotlin.Customer;
import com.main.kotlin.Product;
import com.main.kotlin.ProductDao;
import com.main.kotlin.ProductDaoKotlin;

import java.util.Optional;

public class OperationsValuePresent {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerServiceJava();
        ProductDao productDao = new ProductDaoKotlin();

        String passportNumber = "";

        customerService.getCustomer(passportNumber)
                .map(Customer::lastPurchase)
                .ifPresent(product -> productDao.save(product));

        customerService.getCustomer(passportNumber)
                .map(Customer::lastPurchase)
                .ifPresent(productDao::save);
    }
}
