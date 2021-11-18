package com.shopProj.promo.dto;

import java.math.BigDecimal;

public class Product {
	
	private String skuId;
	private BigDecimal basePrice;
	/**
	 * @return the skuId
	 */
	public String getSkuId() {
		return skuId;
	}
	/**
	 * @param skuId the skuId to set
	 */
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	/**
	 * @return the basePrice
	 */
	public BigDecimal getBasePrice() {
		return basePrice;
	}
	/**
	 * @param basePrice the basePrice to set
	 */
	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
	}
	
	

}
