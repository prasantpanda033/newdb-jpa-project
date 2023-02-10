package com.biju.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biju.demo.entity.Business;
import com.biju.demo.service.BusinessService;

@RestController
public class BusinessController {

	@Autowired
	BusinessService businessService;

	@GetMapping(value = "/business")
	public Business businessData(@RequestParam int id) {
		Business business = businessService.getBusiness(id);
		return business;
	}

	@PostMapping(value = "/saveBusiness", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveBusiness(Business business) {
		return businessService.saveBusiness(business);
	}
	@RequestMapping(value = "/deleteBusiness", method = RequestMethod.DELETE)
	public String deleteBusiness(int id) {
		return businessService.deleteBusiness(id);
	}
}
