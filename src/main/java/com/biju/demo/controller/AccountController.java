package com.biju.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biju.demo.entity.Account;
import com.biju.demo.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	AccountService accountService;

	@GetMapping(value = "/account")
	public Account accountData(@RequestParam int id) {
		Account account = accountService.getAccount(id);
		return account;
	}

	@RequestMapping(value = "/saveAccount", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveAccount(Account account) {
		return accountService.saveAccount(account);
		
		//my comment
	}
	
	@RequestMapping(value = "/deleteAccount", method = RequestMethod.DELETE)
	public String deleteAccount(int id) {
		return accountService.deleteAccount(id);
	}
}
