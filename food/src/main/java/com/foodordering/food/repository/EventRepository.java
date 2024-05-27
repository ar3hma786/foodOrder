package com.foodordering.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodordering.food.model.Events;



public interface EventRepository extends JpaRepository<Events, Long> {


}
