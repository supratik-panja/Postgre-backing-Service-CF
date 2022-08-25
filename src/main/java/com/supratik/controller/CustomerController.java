package com.supratik.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.supratik.entities.Customer;
import com.supratik.services.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/customer")
	public List<Customer> getAllCustomer() {
		return customerService.getAllCustomer();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/customer") 
//	@PostMapping("/customer")
	public Customer createCustomer(@RequestBody Customer createCustomerPayload) {
		return customerService.createCustomer(createCustomerPayload);
	}
}
