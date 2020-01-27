package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Role;
import com.example.demo.entities.User;
import com.example.demo.entities.DAO.IUser;

@Service
public class UserService {
	
	@Autowired
	IUser DAO;
	
	public void addOrUpdateUser(User user) {
		DAO.save(user);
	}
	
	public void deleteUser(int id) {
		DAO.deleteById(id);
	}
	
	public List<User> getAllUsers(){
		return DAO.findAll();
	}
	
	public Optional<User> getUser(int id){
		return DAO.findById(id);
	}
	
	public Role getRoleOfUser(User user) {
		return user.getRole();
	}

}
