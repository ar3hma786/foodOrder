package com.foodordering.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodordering.food.model.IngredientsCategory;

public interface IngredientsCategoryRepository extends JpaRepository<IngredientsCategory, Long> {



}
