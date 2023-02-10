package com.biju.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biju.demo.entity.Branch;

@Repository
public interface BranchRepo extends JpaRepository<Branch, Integer> {

}
