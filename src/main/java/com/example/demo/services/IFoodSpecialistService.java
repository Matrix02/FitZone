package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.FoodSpecialist;
import com.example.demo.entities.Meals;

public interface IFoodSpecialistService {
	
	public void addOrUpdateFoodSpecialist(FoodSpecialist foodSpecialist);
	
	public void deleteFoodSpecialist(int id);
	
	public List<FoodSpecialist> getAllFoodSpecialist();
	
	public Optional<FoodSpecialist> getFoodSpecialist(int id);
	
	public Meals getMealsOfFoodSpecialist(FoodSpecialist foodSpecialist);

	public boolean checkFoodSpeApprove(FoodSpecialist foodSpecialist);
	
	public FoodSpecialist approveFoodSpecialist(FoodSpecialist foodSpecialist);
}
