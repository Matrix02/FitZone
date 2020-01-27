package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Client;
import com.example.demo.entities.Exercices;
import com.example.demo.entities.Maladie;
import com.example.demo.entities.Meals;

public interface IClientService {
	
	public void addOrUpdateClient(Client client);
	
	public void deleteClient(int id);
	
	public List<Client> getAllClients();
	
	public Optional<Client> getClient(int id);
	
	public List<Exercices> getExercicesOfCient(Client client);
	
	public List<Maladie> getMaladieOfClient(Client client);
	
	public List<Meals> getMealsOfClient(Client client);

}
