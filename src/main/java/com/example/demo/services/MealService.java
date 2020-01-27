package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Client;
import com.example.demo.entities.Food;
import com.example.demo.entities.FoodSpecialist;
import com.example.demo.entities.Maladie;
import com.example.demo.entities.Meals;
import com.example.demo.entities.TypeOfMeal;
import com.example.demo.entities.DAO.IMeals;

@Service
public class MealService implements IMealService {
	
	@Autowired
	IMeals DAO;
	
	public void addOrUpdateMeal(Meals meal) {
		DAO.save(meal);
	}
	
	public void deleteMeal(int id) {
		DAO.deleteById(id);
	}
	
	public List<Meals> getAllMeals() {
		return DAO.findAll(); 
	}
	
	public Optional<Meals> getMeal(int id){
		return DAO.findById(id);
	}
	
	public List<FoodSpecialist> getFoodSpecialistOfMeal(Meals meal){
		return meal.getFoodSpeciOfMeal();
	}
	
	public List<Maladie> getMaladieOfMeal(Meals meal){
		return meal.getMaladiesOfMeals();
	}
	
	public List<Client> getClientsOfMeal(Meals meal){
		return meal.getClientsOfMeals();
	}
	
	public List<Food> getFoodOfMeal(Meals meal){
		return meal.getFoodInMeal();
	}
	
	public List<TypeOfMeal> gettypeOfMeal(Meals meal){
		return meal.getTypeOfMeal();
	}
}
