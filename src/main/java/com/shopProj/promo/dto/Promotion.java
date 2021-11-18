package com.shopProj.promo.dto;

import java.math.BigDecimal;

public class Promotion {
	
	private String skuId;
	private Integer quantity;
	private BigDecimal effectivePrice;
	private String promotionType;
	private Product productCombo;
	private Integer productComboquantity;
	
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
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the effectivePrice
	 */
	public BigDecimal getEffectivePrice() {
		return effectivePrice;
	}
	/**
	 * @param effectivePrice the effectivePrice to set
	 */
	public void setEffectivePrice(BigDecimal effectivePrice) {
		this.effectivePrice = effectivePrice;
	}
	/**
	 * @return the promotionType
	 */
	public String getPromotionType() {
		return promotionType;
	}
	/**
	 * @param promotionType the promotionType to set
	 */
	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}
	/**
	 * @return the productCombo
	 */
	public Product getProductCombo() {
		return productCombo;
	}
	/**
	 * @param productCombo the productCombo to set
	 */
	public void setProductCombo(Product productCombo) {
		this.productCombo = productCombo;
	}
	/**
	 * @return the productComboquantity
	 */
	public Integer getProductComboquantity() {
		return productComboquantity;
	}
	/**
	 * @param productComboquantity the productComboquantity to set
	 */
	public void setProductComboquantity(Integer productComboquantity) {
		this.productComboquantity = productComboquantity;
	}
	
	

}
