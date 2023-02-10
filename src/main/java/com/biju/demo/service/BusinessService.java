package com.biju.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biju.demo.entity.Business;
import com.biju.demo.repo.BusinessRepo;

@Service
public class BusinessService {

	@Autowired
	BusinessRepo businessRepo;

	public Business getBusiness(int id) {
		Optional<Business> business = businessRepo.findById(id);
		if (business.isPresent())
			return (business.get());
		else
			return null;
	}

	public String saveBusiness(Business business) {
		try {
			businessRepo.save(business);
			return "Successful";
		} catch (Exception e) {
			return "Failed";
		}
	}

	public String deleteBusiness(int id) {
		try {
			businessRepo.deleteById(id);
			return "Successful";
		} catch (Exception e) {
			return "Unsucessful";
		}
	}
}
