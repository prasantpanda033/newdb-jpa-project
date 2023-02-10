package com.biju.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biju.demo.entity.Customer;
import com.biju.demo.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo customerRepo;

	public Customer getCustomer(int id) {
		Optional<Customer> customer = customerRepo.findById(id);
		if (customer.isPresent())
			return (customer.get());
		else
			return null;
	}

	public String saveCustomer(Customer customer) {
		try {
			customerRepo.save(customer);
			return "Successful";
		} catch (Exception e) {
			return "failed";
		}
	}

	public String deleteCustomer(int id) {
		try {
			customerRepo.deleteById(id);
			return "Successful";
		} catch (Exception e) {
			return "Unsuccessful";
		}
	}
}
