package com.biju.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biju.demo.entity.AccTransaction;
import com.biju.demo.entity.AccTransactionPK;
import com.biju.demo.repo.AccTransactionRepo;

@Service("actTxnService")
public class AccTransactionService {

	@Autowired
	AccTransactionRepo accTransactionRepo;

	public AccTransaction getAccTransaction(int actId,int txnId) {
		
		AccTransactionPK accTransactionPK = new AccTransactionPK();
		
		accTransactionPK.setAccountId(actId);
		accTransactionPK.setTxnId((long)txnId);
		
		Optional<AccTransaction> accTransaction = accTransactionRepo.findById(accTransactionPK);
		if (accTransaction.isPresent())
			return (accTransaction.get());
		else
			return null;
	}
	public String saveAcc(AccTransaction accTransaction) {
		try {
			accTransactionRepo.save(accTransaction);
			return "Successful";
		} catch (Exception e) {
			return "failed";
		}
	}
	
	public String deleteAccTransaction(AccTransactionPK id) {
		try {
			accTransactionRepo.deleteById(id);
			return "Successful";
		} catch (Exception e) {
			return "Unsuccessful";
		}
	}
	
}
