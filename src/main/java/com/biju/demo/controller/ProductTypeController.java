package com.biju.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biju.demo.entity.ProductType;
import com.biju.demo.service.ProductTypeService;

@RestController
public class ProductTypeController {

	@Autowired
	ProductTypeService productTypeService;
	
	@GetMapping(value="/productType")
	public ProductType productTypeData(@RequestParam String id) {
		return productTypeService.getProductType(id);
	}
	@RequestMapping(value = "/saveProductType", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveProductType(ProductType productType) {
		return productTypeService.saveProductType(productType);
	}
	 @RequestMapping(value = "/deleteProductType", method = RequestMethod.DELETE)
	 public String deleteProductType(String id) {
		 return productTypeService.deleteProductType(id);
	 }
}
