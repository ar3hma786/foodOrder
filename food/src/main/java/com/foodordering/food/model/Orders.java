package com.foodordering.food.model;

import java.util.Date;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Order")
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private User customer;
	
    private Long totalAmount;
	
	private String orderStatus;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	@ManyToOne
	private Address deliveryAddress;

	@OneToMany
	private List<OrderItem> items;
	
	@ManyToOne
	private Rider rider;

	@OneToOne
	private Payment payment;
	
	private Integer totalItem;
	
	private Integer totalPrice;

}
