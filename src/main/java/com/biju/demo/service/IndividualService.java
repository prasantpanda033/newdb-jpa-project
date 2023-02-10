package com.biju.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biju.demo.entity.Individual;
import com.biju.demo.repo.IndividualRepo;

@Service
public class IndividualService {

	@Autowired
	IndividualRepo individualRepo;
	
	public Individual getIndividual(int id) {
		Optional<Individual> individual = individualRepo.findById(id);
		
		if (individual.isPresent())
		return (individual.get());
		
		else 
			return null;
	}
	public String saveIndividual(Individual individual) {
		try {
			individualRepo.save(individual);
			return "Sucessfull";
		} catch (Exception e) {
			return "failed";
		}
	}
	public String deleteIndividual(int id) {
		try {
			individualRepo.deleteById(id);
			return "Sucessfull";
		} catch (Exception e) {
			return "Unsucessfull";
		}
	}
}
