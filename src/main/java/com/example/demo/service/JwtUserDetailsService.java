package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.example.demo.entities.User;

import com.example.demo.entities.DAO.IUser;
import com.example.demo.model.UserDTO;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class JwtUserDetailsService implements UserDetailsService {
		
	
	@Autowired
	private IUser userDao;

	@Autowired
	private PasswordEncoder bcryptEncoder;
	
		
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDao.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		System.out.println(getAuthorities(user));
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),getAuthorities(user));
	}
	

	
	public List<GrantedAuthority> getAuthorities(User user) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(user.getRole().getLabel());
		authorities.add(grantedAuthority);
	
		return authorities;
	}

	
	// This Method is responsible for setting both name and user name in the database, the DTO was used to fetch the data at once;
	
		public User save(UserDTO user) {
		User newUser = new User();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setRole(user.getRole());
		return userDao.save(newUser);
		}
}