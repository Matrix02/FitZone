package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Meals;
import com.example.demo.entities.TypeOfMeal;
import com.example.demo.entities.DAO.ITyeOfMeal;

@Service
public class TypeOfMealService implements ITypeOfMealService{

	@Autowired
	ITyeOfMeal DAO;
	
	public void addOrUpDateMeal(TypeOfMeal typeOfMeal) {
		DAO.save(typeOfMeal);
	}
	
	public void dleteTypeOfMeal(int id) {
		DAO.deleteById(id);
	}
	
	public List<TypeOfMeal> getAllTypesOfMeals(){
		return DAO.findAll();
	}
	
	public Optional<TypeOfMeal> getTypeOfMeal(int id){
		return DAO.findById(id);
	}
	
	public List<Meals> getMealsOfType(TypeOfMeal typeOfMeal){
		return typeOfMeal.getMeal();
	}
	
}
