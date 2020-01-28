package com.example.demo.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;

	@OneToMany(mappedBy = "FoodOfType", fetch = FetchType.LAZY)
	List<TypeOfFood> typeOfFood;

	@ManyToMany
	@JoinTable(name = "Food_Meals", joinColumns = @JoinColumn(name = "food_id"), inverseJoinColumns = @JoinColumn(name = "meal_id"))
	List<Meals> MealOfFood;

	@ManyToMany(mappedBy = "foodOfClient")
	List<Client> foodOfClient;
	
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Meals> getMealOfFood() {
		return MealOfFood;
	}

	public void setMealOfFood(List<Meals> mealOfFood) {
		MealOfFood = mealOfFood;
	}

	public List<Client> getFoodOfClient() {
		return foodOfClient;
	}

	public void setFoodOfClient(List<Client> foodOfClient) {
		this.foodOfClient = foodOfClient;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TypeOfFood> getTypeOfFood() {
		return typeOfFood;
	}

	public void setTypeOfFood(List<TypeOfFood> typeOfFood) {
		this.typeOfFood = typeOfFood;
	}


}
