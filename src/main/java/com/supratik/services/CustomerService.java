package com.supratik.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.supratik.entities.Customer;

@Component
public class CustomerService {

	@Autowired
	ICustomerPersistance customer;
	
	public List<Customer> getAllCustomer() {
		return customer.findAll();
	}
	
	public Customer createCustomer(Customer customerPayload) {
		return customer.save(customerPayload);
	}
}
