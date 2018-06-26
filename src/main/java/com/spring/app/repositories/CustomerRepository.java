package com.spring.app.repositories;

import com.spring.app.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Plokeshwar on 6/26/2018.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
