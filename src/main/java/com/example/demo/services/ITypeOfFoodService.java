package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Food;
import com.example.demo.entities.TypeOfFood;

public interface ITypeOfFoodService {
	
	public void addOrUpdate(TypeOfFood typeOfFood);
	
	public void deleteTypeOfFood(int id);
	
	public List<TypeOfFood> getTypesOfFood();
	
	public Optional<TypeOfFood> getOneTypeOfFood(int id);
	
	public Food getFoodOfType(TypeOfFood typeOfFood);

}
