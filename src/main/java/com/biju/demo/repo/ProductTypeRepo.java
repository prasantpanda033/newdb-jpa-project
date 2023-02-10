package com.biju.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biju.demo.entity.ProductType;

@Repository
public interface ProductTypeRepo extends JpaRepository<ProductType, String> {

}
