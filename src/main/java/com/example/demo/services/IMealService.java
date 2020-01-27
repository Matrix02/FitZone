package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Client;
import com.example.demo.entities.Food;
import com.example.demo.entities.FoodSpecialist;
import com.example.demo.entities.Maladie;
import com.example.demo.entities.Meals;
import com.example.demo.entities.TypeOfMeal;

public interface IMealService {
	
	public void addOrUpdateMeal(Meals meal);
	
	public void deleteMeal(int id);
	
	public List<Meals> getAllMeals();
	
	public Optional<Meals> getMeal(int id);
	
	public List<FoodSpecialist> getFoodSpecialistOfMeal(Meals meal);
	
	public List<Maladie> getMaladieOfMeal(Meals meal);
	
	public List<Client> getClientsOfMeal(Meals meal);
	
	public List<Food> getFoodOfMeal(Meals meal);
	
	public List<TypeOfMeal> gettypeOfMeal(Meals meal);

}
