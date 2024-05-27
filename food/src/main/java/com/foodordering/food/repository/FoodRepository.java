package com.foodordering.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodordering.food.model.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {


}
