package com.biju.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biju.demo.entity.Customer;
import com.biju.demo.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping(value = "/customer")
	public Customer customerData(@RequestParam int id) {
		Customer customer = customerService.getCustomer(id);
		return customer;
	}

	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveCustomer(Customer customer) {
		return customerService.saveCustomer(customer);
	}
	
	@RequestMapping(value = "/deleteCustomer", method = RequestMethod.DELETE)
	public String deleteCustomer(int id) {
		return customerService.deleteCustomer(id);
	}
}
