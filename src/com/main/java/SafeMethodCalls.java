package com.main.java;

import com.main.kotlin.Customer;
import com.main.kotlin.Product;

import java.util.Optional;

public class SafeMethodCalls {

    public static void main(String[] args) {

        CustomerService customerService = new CustomerServiceJava();

        String passportNumber = "";
        Optional<Customer> customer = customerService.getCustomer(passportNumber);
        Optional<Product> lastPurchase = customer.map(c -> c.lastPurchase());

        Optional<Product> product1 = customerService.getCustomer(passportNumber)
                .map(Customer::lastPurchase);
    }
}


