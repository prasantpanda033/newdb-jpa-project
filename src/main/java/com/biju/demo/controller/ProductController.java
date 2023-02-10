package com.biju.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biju.demo.entity.Product;
import com.biju.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping(value = "/product")
	public Product productData(@RequestParam String id) {
		return productService.getProduct(id);
	}

	@RequestMapping(value = "/saveProduct", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveProduct(Product product) {
		return productService.saveProduct(product);
	}
	
	@RequestMapping(value = "/deleteProduct", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String deleteProduct(String id) {
		return productService.deleteProduct(id);
	}
}
