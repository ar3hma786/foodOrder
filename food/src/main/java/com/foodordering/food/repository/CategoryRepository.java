package com.foodordering.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodordering.food.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {



}
