package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Client;
import com.example.demo.entities.Maladie;
import com.example.demo.entities.Meals;

public interface IMaladieService {
	
	public void addOrUpDateMaladie(Maladie maladie);
	
	public void deleteMaladie(int id);
	
	public List<Maladie> getAllMaladies();
	
	public Optional<Maladie> getMaladie(int id);
	
	public List<Client> getMaladieOfClient(Maladie maladie);
	
	public List<Meals> getAllMaladieOfMeal(Maladie maladie);

}
