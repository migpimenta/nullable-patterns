package com.main.java;

import com.main.kotlin.Customer;
import com.main.kotlin.LoyaltyTier;

import java.util.Optional;

public class DefaultValue {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerServiceJava();

        Optional<Customer> customer = customerService.getCustomer(PASSPORT_);
        LoyaltyTier tier = customer.map(Customer::getLoyaltyTier).orElse(LoyaltyTier.BASIC);
    }
}
