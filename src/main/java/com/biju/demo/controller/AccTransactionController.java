package com.biju.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biju.demo.entity.AccTransaction;
import com.biju.demo.service.AccTransactionService;

@RestController
public class AccTransactionController {

	@Autowired
	AccTransactionService accTransactionService;
	

	@GetMapping(value = "/accTransaction")
	public AccTransaction accTransactionrData(@RequestParam("accountId") int actId, @RequestParam("txnId") int txnId) {
		AccTransaction accTransaction = accTransactionService.getAccTransaction(actId, txnId);
		return accTransaction;
	}

	@PostMapping(value = "/saveAccTransaction", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveAccTransaction(AccTransaction accTransaction) {
		return accTransactionService.saveAcc(accTransaction);
	}

}
