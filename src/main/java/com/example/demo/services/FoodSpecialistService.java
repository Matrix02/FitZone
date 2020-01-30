package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.FoodSpecialist;
import com.example.demo.entities.Meals;
import com.example.demo.entities.DAO.IFoodSpecialist;

@Service
public class FoodSpecialistService implements IFoodSpecialistService {
	
	@Autowired
	IFoodSpecialist DAO;
	
	public void addOrUpdateFoodSpecialist(FoodSpecialist foodSpecialist) {
		DAO.save(foodSpecialist);
	}
	
	public void deleteFoodSpecialist(int id) {
		DAO.deleteById(id);
	}
	
	public List<FoodSpecialist> getAllFoodSpecialist(){
		return DAO.findAll();
	}
	
	public Optional<FoodSpecialist> getFoodSpecialist(int id){
		return DAO.findById(id);
	}
	
	public boolean checkFoodSpeApprove(FoodSpecialist foodSpecialist) {
		return foodSpecialist.isApproval();
	}
	
	public FoodSpecialist approveFoodSpecialist(FoodSpecialist foodSpecialist) {
		foodSpecialist.setApproval(true);
		return DAO.save(foodSpecialist);
	}
	
	public List<Meals> getMealsOfFoodSpecialist(FoodSpecialist foodSpecialist){
		return foodSpecialist.getMealsOfFoodSpe();
	}

}
