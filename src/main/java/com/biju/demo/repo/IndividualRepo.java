package com.biju.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biju.demo.entity.Individual;

@Repository
public interface IndividualRepo extends JpaRepository<Individual, Integer> {

}
