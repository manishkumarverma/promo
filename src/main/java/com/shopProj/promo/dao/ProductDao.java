package com.shopProj.promo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopProj.promo.model.Product;

public interface ProductDao extends JpaRepository<Product, String> {

}