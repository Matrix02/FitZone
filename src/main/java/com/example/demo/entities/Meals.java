package com.example.demo.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Meals {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String photo;
	private String description;
	private String calories;

	@OneToMany(mappedBy = "mealsOfFoodSpe", fetch = FetchType.LAZY)
	List<FoodSpecialist> foodSpeciOfMeal;

	@ManyToMany(mappedBy = "maladiesOFMeals")
	List<Maladie> maladiesOfMeals;

	@ManyToMany(mappedBy = "mealsOfClient")
	List<Client> clientsOfMeals;

	@ManyToMany(mappedBy = "MealOfFood")
	List<Food> foodInMeal;
	
	@OneToMany(mappedBy = "mealsOfFoodSpe", fetch = FetchType.LAZY)
	private List<TypeOfMeal> typeOfMeal;

	public Meals() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Maladie> getMaladiesOfMeals() {
		return maladiesOfMeals;
	}

	public void setMaladiesOfMeals(List<Maladie> maladiesOfMeals) {
		this.maladiesOfMeals = maladiesOfMeals;
	}

	public List<Client> getClientsOfMeals() {
		return clientsOfMeals;
	}

	public void setClientsOfMeals(List<Client> clientsOfMeals) {
		this.clientsOfMeals = clientsOfMeals;
	}

	public List<Food> getFoodInMeal() {
		return foodInMeal;
	}

	public void setFoodInMeal(List<Food> foodInMeal) {
		this.foodInMeal = foodInMeal;
	}

	public List<FoodSpecialist> getFoodSpeciOfMeal() {
		return foodSpeciOfMeal;
	}

	public void setFoodSpeciOfMeal(List<FoodSpecialist> foodSpeciOfMeal) {
		this.foodSpeciOfMeal = foodSpeciOfMeal;
	}

	public List<TypeOfMeal> getTypeOfMeal() {
		return typeOfMeal;
	}

	public void setTypeOfMeal(List<TypeOfMeal> typeOfMeal) {
		this.typeOfMeal = typeOfMeal;
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

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCalories() {
		return calories;
	}

	public void setCalories(String calories) {
		this.calories = calories;
	}

}
