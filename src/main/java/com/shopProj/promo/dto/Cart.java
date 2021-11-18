package com.shopProj.promo.dto;

import java.util.List;

public class Cart {
	
	List<CartItem> cartItems;

	/**
	 * @return the cartItems
	 */
	public List<CartItem> getCartItems() {
		return cartItems;
	}

	/**
	 * @param cartItems the cartItems to set
	 */
	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	
}
