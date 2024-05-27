package com.foodordering.food.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Rider {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String riderName;
	private String vehicleDetails;
	private String riderContact;
	
	@OneToOne
	private User user;
	
	@ManyToOne
	private Restaurant restaurant;
	
	@OneToMany(mappedBy = "rider", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Orders> orders = new ArrayList<>();
}
