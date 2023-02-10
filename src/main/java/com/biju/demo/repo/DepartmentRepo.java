package com.biju.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biju.demo.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
