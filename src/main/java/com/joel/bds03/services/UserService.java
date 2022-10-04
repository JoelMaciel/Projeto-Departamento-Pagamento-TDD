package com.joel.bds03.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.joel.bds03.repositories.UserRepository;

import lombok.extern.log4j.Log4j2;


@Log4j2
@Service
public class UserService implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		var user = userRepository.findByEmail(username);
		if (user == null) {
			log.error("User not found : " , username);
			throw new UsernameNotFoundException("Email not found  : " + username);
		}

		log.info("User found : " + username);
		return user;
	}


}
