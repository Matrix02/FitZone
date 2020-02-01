package com.example.demo.model;

import com.example.demo.entities.Role;
import com.example.demo.entities.User;

public class FoodSpecialistDTO {
	private String photo;
	private String bio;
	private boolean approval = false;
	private User user;
	private Role role;
	
	public Role getUserRole() {
		return role;
	}
	public void setUserRole(Role role) {
		this.role = role;
	}
	
	
	public String getUserPassword() {
		return user.getPassword();
	}
	
	public String getUserUsername() {
		return user.getUsername();
	}
	
	public void setUserPassword(String password) {
		user.setPassword(password);
	}
	
	public void setUserUsername(String username) {
		user.setUsername(username);
	}
	
	
	public String getFsPhoto() {
		return photo;
	}
	public void setFsPhoto(String photo) {
		this.photo = photo;
	}
	public String getFsBio() {
		return bio;
	}
	public void setFsBio(String bio) {
		this.bio = bio;
	}
	public boolean getFsApproval() {
		return approval;
	}
	public void setFsApproval(boolean approval) {
		this.approval = approval;
	}
	
	
	

}
