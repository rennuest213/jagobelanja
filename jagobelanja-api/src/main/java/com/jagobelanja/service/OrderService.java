package com.jagobelanja.service;

import com.jagobelanja.entity.Order;


import java.util.List;


public interface OrderService {
    //get all Order
    List<Order> getOrders();

    //get order by id
    Order getOrder(long id);

    //create order
    Order createOrder(Order order);

    //update order
    Order updateOrder(Order order);

    //delete order
    void deleteOrder(long id);
}
