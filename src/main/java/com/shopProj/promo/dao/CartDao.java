package com.shopProj.promo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopProj.promo.model.Cart;

public interface CartDao extends JpaRepository<Cart, Long> {

}