package com.foodordering.food.response;


import com.foodordering.food.domain.USER_ROLE;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
	
	
	private String token;
	
	private String message;
	
	private USER_ROLE role;

}
