package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Food;
import com.example.demo.entities.TypeOfFood;
import com.example.demo.entities.DAO.IFood;

@Service
public class FoodService implements IFoodService{

	@Autowired
	IFood DAO;
	
	public void addOrUpdateFood(Food food) {
		DAO.save(food);
	}
	
	public void deleteFood(int id) {
		DAO.deleteById(id);
	}
	
	public List<Food> getAllFood(){
		return DAO.findAll();
	}
	
	public Optional<Food> getFood(int id){
		return DAO.findById(id);
	}
	
	public List<TypeOfFood> getTypeOfFood(Food food){
		return food.getTypeOfFood();
	}
}
