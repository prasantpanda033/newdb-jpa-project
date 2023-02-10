package com.biju.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biju.demo.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, String> {

}
