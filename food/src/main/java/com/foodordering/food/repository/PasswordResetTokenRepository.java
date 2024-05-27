package com.foodordering.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodordering.food.model.PasswordResetToken;


public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {

}
