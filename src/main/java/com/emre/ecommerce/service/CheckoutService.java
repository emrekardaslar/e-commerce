package com.emre.ecommerce.service;

import com.emre.ecommerce.dto.Purchase;
import com.emre.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
