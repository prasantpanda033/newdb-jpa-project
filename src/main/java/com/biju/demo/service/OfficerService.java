package com.biju.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biju.demo.entity.Officer;
import com.biju.demo.repo.OfficerRepo;

@Service
public class OfficerService {

	@Autowired
	OfficerRepo officerRepo;

	public Officer getOfficer(int id) {
		Optional<Officer> officer = officerRepo.findById(id);

		if (officer.isPresent())
			return (officer.get());

		else
			return null;
	}

	public String saveOfficer(Officer officer) {
		try {
			officerRepo.save(officer);
			return "Sucessful";
		} catch (Exception e) {
			return "Unsucessfull";
		}
	}

	public String deleteOfficer(int id) {
		try {
			officerRepo.deleteById(id);
			return "Successful";
		} catch (Exception e) {
			return "failed";
		}
	}
}
