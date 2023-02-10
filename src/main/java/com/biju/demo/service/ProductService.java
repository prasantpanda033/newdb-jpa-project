package com.biju.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biju.demo.entity.Product;
import com.biju.demo.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo productRepo;

	public Product getProduct(String id) {
		Optional<Product> product = productRepo.findById(id);

		if (product.isPresent())
			return (product.get());

		else
			return null;
	}

	public String saveProduct(Product product) {
		try {
			productRepo.save(product);
			return "Sucessfull";
		} catch (Exception e) {
			return "Unsucessfull";
		}
	}

	public String deleteProduct(String id) {
		try {
			productRepo.deleteById(id);
			return "Sucessfull";
		} catch (Exception e) {
			return "Failuar"	;		
		}  
	}
}
