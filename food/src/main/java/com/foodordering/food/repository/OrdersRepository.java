package com.foodordering.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodordering.food.model.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long> {


}
