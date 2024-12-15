package com.jagobelanja.service;

import com.jagobelanja.entity.OrderItem;
import com.jagobelanja.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    //dependency injection
    private final OrderItemRepository orderItemRepository;

    @Autowired
    public OrderItemServiceImpl(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public List<OrderItem> getOrderItems() {
        return orderItemRepository.findAll();
    }

    @Override
    public OrderItem getOrderItemById(long id) {
        return orderItemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order Item not found"));
    }

    @Override
    public OrderItem createOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    @Override
    public OrderItem updateOrderItem(OrderItem orderItem) {
        //if order item not exist
        if (!orderItemRepository.existsById(orderItem.getId())){
            throw new RuntimeException("Order Item not found");
        }
        return orderItemRepository.save(orderItem);
    }

    @Override
    public void deleteOrderItem(long id) {
        orderItemRepository.deleteById(id);
    }
}
