package com.example.demo.entities;

import java.util.List;

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
public class TypeOfMeal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String label;

	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	Meals mealsOfFoodSpe;

	public TypeOfMeal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Meals getMealsOfFoodSpe() {
		return mealsOfFoodSpe;
	}


	public void setMealsOfFoodSpe(Meals mealsOfFoodSpe) {
		this.mealsOfFoodSpe = mealsOfFoodSpe;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
