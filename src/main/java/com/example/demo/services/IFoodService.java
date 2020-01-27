package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Food;
import com.example.demo.entities.TypeOfFood;

public interface IFoodService {
	
	public void addOrUpdateFood(Food food);
	
	public void deleteFood(int id);
	
	public List<Food> getAllFood();
	
	public Optional<Food> getFood(int id);
	
	public List<TypeOfFood> getTypeOfFood(Food food);

}
