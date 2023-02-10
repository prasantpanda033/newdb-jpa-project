package com.biju.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biju.demo.entity.ProductType;
import com.biju.demo.repo.ProductTypeRepo;

@Service
public class ProductTypeService {

	@Autowired
	ProductTypeRepo productTypeRepo;

	public ProductType getProductType(String id) {
		Optional<ProductType> productType = productTypeRepo.findById(id);

		if (productType.isPresent())
			return (productType.get());

		else
			return null;
	}

	public String saveProductType(ProductType productType) {
		try {
			productTypeRepo.save(productType);
			return "Successful";
		} catch (Exception e) {
			return "Failed";
		}
	}

	public String deleteProductType(String id) {
		try {
			productTypeRepo.deleteById(id);
			return "Successful";
		} catch (Exception e) {
			return "Failed";
		}
	}
}
