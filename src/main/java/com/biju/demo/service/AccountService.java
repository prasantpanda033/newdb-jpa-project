package com.biju.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biju.demo.entity.Account;
import com.biju.demo.repo.AccountRepo;

@Service
public class AccountService {
	@Autowired
	AccountRepo accountRepo;

	public Account getAccount(int id) {
		Optional<Account> account = accountRepo.findById(id);
		if (account.isPresent())
			return (account.get());
		else
			return null;
	}

	public String saveAccount(Account account) {
		try {
			accountRepo.save(account);
			return "Successful";
		} catch (Exception e) {
			return "failed";
		}
	}
	public String deleteAccount(int id) {
		try {
			accountRepo.deleteById(id);
			return "Delete Successful";
		}catch (Exception e) {
			return "Unsuccessful";
		}
	}
}
