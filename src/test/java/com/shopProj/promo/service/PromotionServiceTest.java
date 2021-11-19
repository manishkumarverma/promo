package com.shopProj.promo.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.shopProj.promo.model.Cart;
import com.shopProj.promo.model.CartItem;
import com.shopProj.promo.model.Product;
import com.shopProj.promo.model.Promotion;

public class PromotionServiceTest {
	
	 PromotionService promotionService=new PromotionServiceImpl();;
	

	//@Test
	public void applyPromotionTest() {
		
		Cart cart=new Cart();
		
		Product pA=new Product();
		pA.setSkuId("A");
		pA.setBasePrice(50.0);
		
		Product pB=new Product();
		pB.setSkuId("B");
		pB.setBasePrice(30.0);
		
		
		Product pC=new Product();
		pC.setSkuId("C");
		pC.setBasePrice(20.0);
		
		Product pD=new Product();
		pD.setSkuId("D");
		pD.setBasePrice(15.0);
		
		Promotion promoA=new Promotion();
		promoA.setProduct(pA);
		promoA.setQuantity(3);
		promoA.setEffectivePrice(130.0);
		
		Promotion promoB=new Promotion();
		promoB.setProduct(pB);
		promoB.setQuantity(2);
		promoB.setEffectivePrice(45.0);
		
		Promotion promoC=new Promotion();
		promoC.setProduct(pC);
		promoC.setQuantity(1);
		promoC.setEffectivePrice(30.0);
promoC.setProductComboId("D");
		
		Promotion promoD=new Promotion();
		promoD.setProduct(pD);
		promoD.setQuantity(1);
		promoD.setEffectivePrice(30.0);
		promoD.setProductComboId("C");
		
		pA.setPromotions( Arrays.asList(promoA));
		pB.setPromotions( Arrays.asList(promoB));
		pC.setPromotions( Arrays.asList(promoC));
		pD.setPromotions( Arrays.asList(promoD));
		
		CartItem cartItemA=new CartItem();
		cartItemA.setCart(cart);
		cartItemA.setProduct(pA);
		cartItemA.setQuantity(1);
		cartItemA.setPromotionApplied(false);
		
		CartItem cartItemB=new CartItem();
		cartItemB.setCart(cart);
		cartItemB.setProduct(pB);
		cartItemB.setQuantity(1);
		cartItemB.setPromotionApplied(false);
		
		CartItem cartItemC=new CartItem();
		cartItemC.setCart(cart);
		cartItemC.setProduct(pC);
		cartItemC.setQuantity(1);
		cartItemC.setPromotionApplied(false);
		cart.setCartItems( Arrays.asList(cartItemA,cartItemB,cartItemC));
		
		promotionService.applyPromotion(cart);
	}
	
	//@Test
	public void applyPromotionTest2() {
		
		Cart cart=new Cart();
		
		Product pA=new Product();
		pA.setSkuId("A");
		pA.setBasePrice(50.0);
		
		Product pB=new Product();
		pB.setSkuId("B");
		pB.setBasePrice(30.0);
		
		
		Product pC=new Product();
		pC.setSkuId("C");
		pC.setBasePrice(20.0);
		
		Product pD=new Product();
		pD.setSkuId("D");
		pD.setBasePrice(15.0);
		
		Promotion promoA=new Promotion();
		promoA.setProduct(pA);
		promoA.setQuantity(3);
		promoA.setEffectivePrice(130.0);
		
		Promotion promoB=new Promotion();
		promoB.setProduct(pB);
		promoB.setQuantity(2);
		promoB.setEffectivePrice(45.0);
		
		Promotion promoC=new Promotion();
		promoC.setProduct(pC);
		promoC.setQuantity(1);
		promoC.setEffectivePrice(30.0);
		promoC.setProductComboId("D");
		
		Promotion promoD=new Promotion();
		promoD.setProduct(pD);
		promoD.setQuantity(1);
		promoD.setEffectivePrice(30.0);
		promoD.setProductComboId("C");
		
		pA.setPromotions( Arrays.asList(promoA));
		pB.setPromotions( Arrays.asList(promoB));
		pC.setPromotions( Arrays.asList(promoC));
		pD.setPromotions( Arrays.asList(promoD));
		
		CartItem cartItemA=new CartItem();
		cartItemA.setCart(cart);
		cartItemA.setProduct(pA);
		cartItemA.setQuantity(5);
		cartItemA.setPromotionApplied(false);
		
		CartItem cartItemB=new CartItem();
		cartItemB.setCart(cart);
		cartItemB.setProduct(pB);
		cartItemB.setQuantity(5);
		cartItemB.setPromotionApplied(false);
		
		CartItem cartItemC=new CartItem();
		cartItemC.setCart(cart);
		cartItemC.setProduct(pC);
		cartItemC.setQuantity(1);
		cartItemC.setPromotionApplied(false);
		cart.setCartItems( Arrays.asList(cartItemA,cartItemB,cartItemC));
		
		promotionService.applyPromotion(cart);
	}

	@Test
public void applyPromotionTest3() {
		
		Cart cart=new Cart();
		
		Product pA=new Product();
		pA.setSkuId("A");
		pA.setBasePrice(50.0);
		
		Product pB=new Product();
		pB.setSkuId("B");
		pB.setBasePrice(30.0);
		
		
		Product pC=new Product();
		pC.setSkuId("C");
		pC.setBasePrice(20.0);
		
		Product pD=new Product();
		pD.setSkuId("D");
		pD.setBasePrice(15.0);
		
		Promotion promoA=new Promotion();
		promoA.setProduct(pA);
		promoA.setQuantity(3);
		promoA.setEffectivePrice(130.0);
		
		Promotion promoB=new Promotion();
		promoB.setProduct(pB);
		promoB.setQuantity(2);
		promoB.setEffectivePrice(45.0);
		
		Promotion promoC=new Promotion();
		promoC.setProduct(pC);
		promoC.setQuantity(1);
		promoC.setEffectivePrice(30.0);
       promoC.setProductComboId("D");
		
		Promotion promoD=new Promotion();
		promoD.setProduct(pD);
		promoD.setQuantity(1);
		promoD.setEffectivePrice(30.0);
		promoD.setProductComboId("C");
		
		pA.setPromotions( Arrays.asList(promoA));
		pB.setPromotions( Arrays.asList(promoB));
		pC.setPromotions( Arrays.asList(promoC));
		pD.setPromotions( Arrays.asList(promoD));
		
		CartItem cartItemA=new CartItem();
		cartItemA.setCart(cart);
		cartItemA.setProduct(pA);
		cartItemA.setQuantity(3);
		cartItemA.setPromotionApplied(false);
		
		CartItem cartItemB=new CartItem();
		cartItemB.setCart(cart);
		cartItemB.setProduct(pB);
		cartItemB.setQuantity(5);
		cartItemB.setPromotionApplied(false);
		
		CartItem cartItemC=new CartItem();
		cartItemC.setCart(cart);
		cartItemC.setProduct(pC);
		cartItemC.setQuantity(1);
		cartItemC.setPromotionApplied(false);
		
		CartItem cartItemD=new CartItem();
		cartItemD.setCart(cart);
		cartItemD.setProduct(pD);
		cartItemD.setQuantity(1);
		cartItemD.setPromotionApplied(false);
		cart.setCartItems( Arrays.asList(cartItemA,cartItemB,cartItemC,cartItemD));
		
		promotionService.applyPromotion(cart);
	}

}
