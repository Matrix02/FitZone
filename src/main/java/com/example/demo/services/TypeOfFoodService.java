package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Food;
import com.example.demo.entities.TypeOfFood;
import com.example.demo.entities.DAO.ITypeOfFood;

@Service
public class TypeOfFoodService implements ITypeOfFoodService{

	@Autowired
	ITypeOfFood DAO;
	
	public void addOrUpdate(TypeOfFood typeOfFood) {
		DAO.save(typeOfFood);
	}
	
	public void deleteTypeOfFood(int id) {
		DAO.deleteById(id);
	}
	
	public List<TypeOfFood> getTypesOfFood(){
		return DAO.findAll();
	}
	
	public Optional<TypeOfFood> getOneTypeOfFood(int id){
		return DAO.findById(id);
	}
	
	public Food getFoodOfType(TypeOfFood typeOfFood){
		return typeOfFood.getFoodOfType();
	}
}