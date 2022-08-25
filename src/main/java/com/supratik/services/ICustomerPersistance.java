package com.supratik.services;

import org.springframework.data.jpa.repository.JpaRepository;
import com.supratik.entities.Customer;

public interface ICustomerPersistance extends JpaRepository<Customer, Long> {

}
