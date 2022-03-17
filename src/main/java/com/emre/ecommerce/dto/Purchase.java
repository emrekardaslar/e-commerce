package com.emre.ecommerce.dto;

import com.emre.ecommerce.entity.Address;
import com.emre.ecommerce.entity.Customer;
import com.emre.ecommerce.entity.Order;
import com.emre.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
