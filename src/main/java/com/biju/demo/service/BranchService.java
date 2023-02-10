package com.biju.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biju.demo.entity.Branch;
import com.biju.demo.repo.BranchRepo;

@Service

public class BranchService {

	@Autowired
	BranchRepo branchRepo;

	public Branch getBranch(int id) {
		Optional<Branch> branch = branchRepo.findById(id);
		if (branch.isPresent())
			return (branch.get());
		else
			return null;
	}

	public String saveBranch(Branch branch) {
		try {
			branchRepo.save(branch);
			return "Sucessfull";
		} catch (Exception e) {
			return "failed";
		}
	}

	public String deleteBrench(int id) {
		try {
			branchRepo.deleteById(id);
			return "Successful";
		} catch (Exception e) {
			return "Unsuccessful";
		}
	}

}
