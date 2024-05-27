package com.foodordering.food.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContactInformation {
	
	private String email;
	private String mobile;
	private String twitter;
	private String instagram;
	private String facebook;

}
