package com.main.java;

import com.main.kotlin.Customer;

import java.util.Optional;

public class Common {
    public static final String PASSPORT_NUMBER = "ABC1234";
}

interface CustomerService {
    Optional<Customer> getCustomer(String passportNumber);
}

class CustomerServiceJava implements CustomerService {
    @Override
    public Optional<Customer> getCustomer(String passportNumber) {
        return Optional.empty();
    }
}