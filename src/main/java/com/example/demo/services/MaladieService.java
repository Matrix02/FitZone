package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Client;
import com.example.demo.entities.Maladie;
import com.example.demo.entities.Meals;
import com.example.demo.entities.DAO.IMaladie;

@Service
public class MaladieService {

	@Autowired
	IMaladie DAO;
	
	public void addOrUpDateMaladie(Maladie maladie) {
		DAO.save(maladie);
	}
	
	public void deleteMaladie(int id) {
		DAO.deleteById(id);
	}
	
	public List<Maladie> getAllMaladies(){
		return DAO.findAll();
	}
	
	public Optional<Maladie> getMaladie(int id){
		return DAO.findById(id);
	}
	
	public List<Client> getMaladieOfClient(Maladie maladie){
		return maladie.getMaladiesOfClient();
	}
	
	public List<Meals> getAllMaladieOfMeal(Maladie maladie){
		return maladie.getMaladiesOFMeals();
	}
}
