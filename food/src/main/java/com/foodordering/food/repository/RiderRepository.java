package com.foodordering.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodordering.food.model.Rider;

public interface RiderRepository extends JpaRepository<Rider, Long> {



}
