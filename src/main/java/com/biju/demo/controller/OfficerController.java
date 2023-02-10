package com.biju.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biju.demo.entity.Officer;
import com.biju.demo.service.OfficerService;

@RestController
public class OfficerController {

	@Autowired
	OfficerService officerService;

	@GetMapping(value = "/officer")
	public Officer officerData(@RequestParam int id) {
		return officerService.getOfficer(id);
	}

	@RequestMapping(value = "/saveOfficer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveOfficer(Officer officer) {
		return officerService.saveOfficer(officer);
	}
	
	@RequestMapping(value = "/deleteOfficer", method = RequestMethod.DELETE)
	public String deleteOfficer(int id) {
		return officerService.deleteOfficer(id);
	}
}
