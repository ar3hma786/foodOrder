package com.foodordering.food.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.foodordering.food.domain.USER_ROLE;
import com.foodordering.food.model.User;
import com.foodordering.food.repository.UserRepository;

@Service
public class CustomUserServiceDetails implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepository.findByEmail(username);
		
		if(user == null)
		{
			throw new UsernameNotFoundException("Invalid username or password" +username);
		}
		
		USER_ROLE role = user.getRole();
		
		if(role == null) role = USER_ROLE.ROLE_CUSTOMER;
		
		System.out.println("role -----  +" +role);
		
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		authorities.add(new SimpleGrantedAuthority(role.toString()));
		
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), authorities);
		
	}

}
