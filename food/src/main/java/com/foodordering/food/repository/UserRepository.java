package com.foodordering.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodordering.food.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
