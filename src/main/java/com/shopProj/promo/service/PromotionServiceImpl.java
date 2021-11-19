package com.shopProj.promo.service;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopProj.promo.dao.CartItemDao;
import com.shopProj.promo.model.Cart;
import com.shopProj.promo.model.CartItem;
import com.shopProj.promo.model.Promotion;

@Service
public class PromotionServiceImpl implements PromotionService {
	@Autowired
	CartItemDao cartItemDao;

	@Override
	public void applyPromotion(Cart cart) {
		// TODO Auto-generated method stub
		List<CartItem> cartItems = cart.getCartItems();
		
		cartItems.forEach(cartItem -> {
			if (!cartItem.isPromotionApplied()) {
				List<Promotion> promotions = cartItem.getProduct().getPromotions();
				int quantity = cartItem.getQuantity().intValue();
				double basePrice = cartItem.getProduct().getBasePrice().doubleValue();

				Collections.sort(promotions, (o1, o2) -> (o1.getEffectivePrice() > o2.getEffectivePrice()) ? 1
						: (o1.getEffectivePrice() < o2.getEffectivePrice()) ? -1 : 0);
				for (Promotion promotion : promotions) {
					int promoQuantity = promotion.getQuantity();
					double promoPrice = promotion.getEffectivePrice();

					if (promoQuantity > quantity || (promoPrice/promoQuantity) > basePrice) {
						continue;
					} else {
						if (promotion.getProductComboId() != null) {
							List<CartItem> result = cartItems.stream()
									.filter(item -> item.getProduct().getSkuId().equals(promotion.getProductComboId()))
									.collect(Collectors.toList());

							if (!result.isEmpty()) {

								cartItem.setTotalPrice(quantity * promoPrice);
								cartItem.setPromotionApplied(true);
								CartItem combo = result.get(0);
								combo.setTotalPrice((combo.getQuantity()-quantity)*combo.getProduct().getBasePrice());
								combo.setPromotionApplied(true);
                                System.out.println(cartItem.getProduct().getSkuId()+" "+quantity+" "+promoPrice);
                                System.out.println(combo.getProduct().getSkuId()+" "+quantity+" "+combo.getTotalPrice());
							}
						} else {
							int factor = quantity / promoQuantity;
							int modulus = quantity % promoQuantity;
							double cartItemTotal = factor * promoPrice + modulus * basePrice;
							cartItem.setTotalPrice(cartItemTotal);
							cartItem.setPromotionApplied(true);
							System.out.println(cartItem.getProduct().getSkuId()+" "+quantity+" "+cartItem.getTotalPrice());
						}
					}
				}

				if(!cartItem.isPromotionApplied())
				{
					cartItem.setTotalPrice(cartItem.getQuantity()*cartItem.getProduct().getBasePrice());
				}
			}
		});
		
		double totalPrice=cartItems.stream().mapToDouble(x->x.getTotalPrice().doubleValue()).sum();
		System.out.println("Total Price: "+totalPrice);

	}

}
