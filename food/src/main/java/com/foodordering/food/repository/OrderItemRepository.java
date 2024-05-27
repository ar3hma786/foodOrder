package com.foodordering.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodordering.food.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
