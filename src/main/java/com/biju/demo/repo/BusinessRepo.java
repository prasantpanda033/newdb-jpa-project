package com.biju.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biju.demo.entity.Business;

@Repository
public interface BusinessRepo extends JpaRepository<Business, Integer> {

}
