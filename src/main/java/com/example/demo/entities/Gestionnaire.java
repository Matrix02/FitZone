package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gestionnaire extends User{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String photo;
	
	public Gestionnaire(int id, String photo) {
		super();
		this.id = id;
		this.photo = photo;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPhoto() {
		return photo;
	}
	
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	

}
