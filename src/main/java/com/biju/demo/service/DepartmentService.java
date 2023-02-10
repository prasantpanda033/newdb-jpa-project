package com.biju.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biju.demo.entity.Department;
import com.biju.demo.repo.DepartmentRepo;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepo departmentRepo;

	public Department getDepartment(int id) {
		Optional<Department> department = departmentRepo.findById(id);

		if (department.isPresent())
			return (department.get());

		else
			return null;
	}

	public String saveDepartment(Department department) {
		try {
			departmentRepo.save(department);
			return "Successful";
		} catch (Exception e) {
			return "Unsuccessful";
		}
	}

	public String deleteDepartment(int id) {
		try {
			departmentRepo.deleteById(id);
			return "Successful";
		} catch (Exception e) {
			return "Successfull";
		}
	}
}
