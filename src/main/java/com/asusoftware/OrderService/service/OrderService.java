package com.asusoftware.OrderService.service;

import com.asusoftware.OrderService.model.OrderRequest;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);
}
