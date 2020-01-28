package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Meals;
import com.example.demo.entities.TypeOfMeal;

public interface ITypeOfMealService {
	
	public void addOrUpDateMeal(TypeOfMeal typeOfMeal);
	
	public void dleteTypeOfMeal(int id);
	
	public List<TypeOfMeal> getAllTypesOfMeals();
	
	public Optional<TypeOfMeal> getTypeOfMeal(int id);
	
	public Meals getMealsOfType(TypeOfMeal typeOfMeal);
	
}
