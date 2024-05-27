package com.foodordering.food.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Food {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String description;
	private Long price;
	
	@ManyToOne
	private Category foodcategory;
	
	@ElementCollection
	@Column(length=1000)
	private List<String> imaages;
	
	private boolean available;
	
	@ManyToOne
	private Restaurant restaurant;
	
	private boolean isVegetarian;
	private boolean isSeasonal;
	
    @ManyToMany
    private List<IngredientsItem> ingredients=new ArrayList<>();
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

}
