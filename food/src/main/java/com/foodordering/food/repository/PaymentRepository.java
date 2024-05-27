package com.foodordering.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodordering.food.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {


}
