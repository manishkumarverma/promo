package com.shopProj.promo.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Promotion")
public class Promotion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long promoId;
	@ManyToOne
	@JoinColumn(name = "skuId", nullable = false)
	private Product product;
	private Integer quantity;
	private BigDecimal effectivePrice;
	private String promotionType;
	private String productComboId;
	private Integer productComboquantity;

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

	public String getProductComboId() {
		return productComboId;
	}

	public void setProductComboId(String productComboId) {
		this.productComboId = productComboId;
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

	public long getPromoId() {
		return promoId;
	}

	public void setPromoId(long promoId) {
		this.promoId = promoId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
