package com.spring.app.bootstrap;

import com.spring.app.domain.Customer;
import com.spring.app.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;

/**
 * Created by Plokeshwar on 6/26/2018.
 */
public class BootStrapData implements CommandLineRunner{

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... strings) throws Exception {

        Customer c1 = new Customer();
        c1.setFirstName("Pravin");
        c1.setLastName("Lokeshwar");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("Tia");
        c2.setLastName("Lokeshwar");
        customerRepository.save(c1);

        Customer c3 = new Customer();
        c3.setFirstName("Kiara");
        c3.setLastName("Lokeshwar");
        customerRepository.save(c1);

        System.out.println("Customer Data Saved. "+customerRepository.count());





    }
}
