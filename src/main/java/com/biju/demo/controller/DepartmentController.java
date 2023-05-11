package com.biju.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biju.demo.entity.Department;
import com.biju.demo.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;

	@GetMapping(value = "/department")
	public Department departmentData(@RequestParam int id) {
		Department department = departmentService.getDepartment(id);
		return department;
		
		
	}

	@RequestMapping(value = "/saveDepartment", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveDepartment(Department department) {
		return departmentService.saveDepartment(department);
	}

	@RequestMapping(value = "/deleteDepartment", method = RequestMethod.POST)
	public String deleteDepartement(int id) {
		return departmentService.deleteDepartment(id);
	}
}
