package com.spring.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Component;

@Component
public class SecurityConfig {

	
	@Bean
	public UserDetailsService userDetailService()
	{
		var userDetails= new InMemoryUserDetailsManager();
		var user= User.withUsername("rakesh").password("123").authorities("read").build();
		
		userDetails.createUser(user);
		return userDetails;
		
	}
	
	@Bean
	public PasswordEncoder passEncoder()
	{
		return NoOpPasswordEncoder.getInstance();
	}
	
	
}
