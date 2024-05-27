package com.foodordering.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodordering.food.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {


}
