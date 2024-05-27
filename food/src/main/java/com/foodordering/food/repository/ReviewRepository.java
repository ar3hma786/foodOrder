package com.foodordering.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodordering.food.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {


}
