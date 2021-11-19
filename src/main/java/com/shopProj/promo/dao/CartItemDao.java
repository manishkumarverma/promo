package com.shopProj.promo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopProj.promo.model.CartItem;

public interface CartItemDao extends JpaRepository<CartItem, Long> {

	CartItem findByCart_CartIdAndProduct_SkuId(Long cartId, String skuId);

}