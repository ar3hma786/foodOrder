package com.foodordering.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodordering.food.model.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long> {



}
