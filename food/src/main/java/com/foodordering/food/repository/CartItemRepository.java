package com.foodordering.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodordering.food.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


}
