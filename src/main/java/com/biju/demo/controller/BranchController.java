package com.biju.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biju.demo.entity.Branch;
import com.biju.demo.service.BranchService;

@RestController
public class BranchController {

	@Autowired
	BranchService branchService;

	@GetMapping(value = "/branch")
	public Branch branchData(@RequestParam int id) {
		Branch branch = branchService.getBranch(id);
		return branch;
	}

	@PostMapping(value = "/saveBranch", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveBranch(Branch branch) {
		return branchService.saveBranch(branch);
	}
	@RequestMapping(value = "/deleteBranch", method = RequestMethod.DELETE)
	public String deleteBranch(int id) {
		return branchService.deleteBrench(id);
	}
}
