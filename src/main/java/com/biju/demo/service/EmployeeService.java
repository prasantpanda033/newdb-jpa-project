package com.biju.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biju.demo.entity.Employee;
import com.biju.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;

	public Employee getEmployee(int id) {
		Optional<Employee> employee = employeeRepo.findById(id);

		if (employee.isPresent())
			return (employee.get());

		else
			return null;
	}

	public String saveEmployee(Employee employee) {
		try {
			employeeRepo.save(employee);
			return "Sucessfull";
		} catch (Exception e) {
			return "Unsucessfull";
		}
	}

	public String deleteEmployee(int id) {
		try {
			employeeRepo.deleteById(id);
			return "Sucessfull";
		} catch (Exception e) {
			return "Unsucessfull";
		}
	}
}
