package com.biju.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biju.demo.entity.Officer;

@Repository
public interface OfficerRepo extends JpaRepository<Officer, Integer> {

}
