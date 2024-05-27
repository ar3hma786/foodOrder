package com.foodordering.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodordering.food.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {


}
