package com.spring.app.service;

import com.spring.app.domain.Customer;

import java.util.List;

/**
 * Created by Plokeshwar on 6/26/2018.
 */
public interface CustomerService  {

    Customer findCustomerByID(Long id);
    List<Customer> findAllCustomers();
    Customer saveCustomer(Customer customer);
}
