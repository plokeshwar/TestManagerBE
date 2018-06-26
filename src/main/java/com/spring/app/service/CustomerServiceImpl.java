package com.spring.app.service;

import com.spring.app.domain.Customer;
import com.spring.app.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Plokeshwar on 6/26/2018.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findCustomerByID(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> findAllCustomers() {

        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }
}
