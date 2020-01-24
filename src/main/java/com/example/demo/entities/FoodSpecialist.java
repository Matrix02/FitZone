package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class FoodSpecialist extends User{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String photo;
	private String bio;
	private boolean approval;
	
	  @ManyToOne
	    @JoinColumn(name = "Meals_id", nullable = false)
	    @OnDelete(action = OnDeleteAction.CASCADE)
	    @JsonIgnore
	    private Meals mealsOfFoodS;
	
	
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
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public boolean isApproval() {
		return approval;
	}
	public void setApproval(boolean approval) {
		this.approval = approval;
	}
	public Meals getMealsOfFoodS() {
		return mealsOfFoodS;
	}
	public void setMealsOfFoodS(Meals mealsOfFoodS) {
		this.mealsOfFoodS = mealsOfFoodS;
	}

}