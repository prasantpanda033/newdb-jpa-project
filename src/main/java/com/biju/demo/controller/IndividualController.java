package com.biju.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biju.demo.entity.Individual;
import com.biju.demo.service.IndividualService;

@RestController
public class IndividualController {

	@Autowired
	IndividualService individualService;

	@GetMapping(value = "/individual")
	public Individual individualData(@RequestParam int id) {
		return individualService.getIndividual(id);
	}

	@RequestMapping(value = "/saveIndividual", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveIndividual(Individual individual) {
		return individualService.saveIndividual(individual);
	}

	@RequestMapping(value = "/deleteIndividual", method = RequestMethod.DELETE)
	public String deleteIndividual(int id) {
		return individualService.deleteIndividual(id);
	}

}
