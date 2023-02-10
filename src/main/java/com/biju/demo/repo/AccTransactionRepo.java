package com.biju.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biju.demo.entity.AccTransaction;
import com.biju.demo.entity.AccTransactionPK;

@Repository
public interface AccTransactionRepo extends JpaRepository<AccTransaction, AccTransactionPK> {

}
