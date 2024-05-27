package com.foodordering.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodordering.food.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {


}
