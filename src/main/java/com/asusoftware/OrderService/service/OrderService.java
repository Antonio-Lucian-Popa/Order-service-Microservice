package com.asusoftware.OrderService.service;

import com.asusoftware.OrderService.model.OrderRequest;
import com.asusoftware.OrderService.model.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
