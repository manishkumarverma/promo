package com.shopProj.promo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopProj.promo.dao.ProductDao;
import com.shopProj.promo.model.Product;

@RestController
public class ProductController {

	@Autowired
	private ProductDao productDao;

	@GetMapping("/GetProducts")
	public List<Product> getProducts() {
//		Product pr=new Product();
//		pr.setSkuId("A");
//		pr.setBasePrice(50);
//		productDao.saveAndFlush(pr);

		return productDao.findAll();
	}

}