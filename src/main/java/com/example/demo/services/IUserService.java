package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Role;
import com.example.demo.entities.User;

public interface IUserService {
	
	public void addOrUpdateUser(User user);
	
	public void deleteUser(int id);
	
	public List<User> getAllUsers();
	
	public Optional<User> getUser(int id);
	
	public Role getRoleOfUser(User user);

}
