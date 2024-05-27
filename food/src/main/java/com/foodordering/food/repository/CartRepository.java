package com.foodordering.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodordering.food.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long>{

}
