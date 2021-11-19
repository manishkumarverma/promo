package com.shopProj.promo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shopProj.promo.dao.CartDao;
import com.shopProj.promo.dao.CartItemDao;
import com.shopProj.promo.dao.ProductDao;
import com.shopProj.promo.model.Cart;
import com.shopProj.promo.model.CartItem;
import com.shopProj.promo.model.Product;

@RestController
public class CartController {

	@Autowired
	private CartItemDao cartItemDao;

	@Autowired
	private CartDao cartDao;

	@Autowired
	private ProductDao productDao;

	@GetMapping("/GetCartItems")
	public CartItem getCartItems(@RequestParam String id) {

		return cartItemDao.findByCart_CartIdAndProduct_SkuId(new Long(id), "B");
	}

	@GetMapping("/GetData")
	public void getData() {

		Product pr = new Product();
		pr.setSkuId("A");
		pr.setBasePrice(new Double(50));
		productDao.saveAndFlush(pr);

		Product pr2 = new Product();
		pr2.setSkuId("B");
		pr2.setBasePrice(new Double(50));
		productDao.saveAndFlush(pr2);
		
		
		Cart cart = new Cart();
		List<CartItem> cari = new ArrayList<>();
		CartItem c1 = new CartItem();
		c1.setProduct(pr);
		c1.setQuantity(5);

		CartItem c2 = new CartItem();
		c2.setProduct(pr2);
		c2.setQuantity(10);
		c1.setCart(cart);
		c2.setCart(cart);
		cari.add(c2);
		cari.add(c1);
		cart.setCartItems(cari);
		
		//cartItemDao.saveAndFlush(c1);
		//cartItemDao.saveAndFlush(c2);
		cartDao.saveAndFlush(cart);
	}
}