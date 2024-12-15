package com.jagobelanja.service;

import com.jagobelanja.entity.OrderItem;

import java.util.List;


public interface OrderItemService {
    //get all order item
    List<OrderItem> getOrderItems();

    //get order item by id
    OrderItem getOrderItemById(long id);

    //create order item
    OrderItem createOrderItem(OrderItem orderItem);

    //update order item
    OrderItem updateOrderItem(OrderItem orderItem);

    //delete order item
    void deleteOrderItem(long id);
}
