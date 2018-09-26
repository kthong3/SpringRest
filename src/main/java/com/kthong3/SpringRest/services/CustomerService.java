package com.kthong3.SpringRest.services;

import com.kthong3.SpringRest.domain.Customer;

import java.util.List;

public interface CustomerService {
    Customer findCustomerById(Long id);
    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);
}
