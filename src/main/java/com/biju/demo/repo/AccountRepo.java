package com.biju.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biju.demo.entity.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {
	

}
