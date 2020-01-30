package com.example.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "User")
public class FoodSpecialist extends User{
	
	private String photo;
	private String bio;
	private boolean approval = false;
	
	  @OneToMany(mappedBy = "MealOFFoodSpeci", fetch = FetchType.LAZY)
	    List<Meals> mealsOfFoodSpe;
	
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
	public List<Meals> getMealsOfFoodSpe() {
		return mealsOfFoodSpe;
	}
	public void setMealsOfFoodSpe(List<Meals> mealsOfFoodSpe) {
		this.mealsOfFoodSpe = mealsOfFoodSpe;
	}
	@Override
	public String toString() {
		return "FoodSpecialist [photo=" + photo + ", bio=" + bio + ", approval=" + approval + ", mealsOfFoodSpe="
				+ mealsOfFoodSpe + "]";
	}

}
