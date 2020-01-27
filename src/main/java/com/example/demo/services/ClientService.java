package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Client;
import com.example.demo.entities.Exercices;
import com.example.demo.entities.Maladie;
import com.example.demo.entities.Meals;
import com.example.demo.entities.DAO.IClient;

@Service
public class ClientService implements IClientService {

	@Autowired
	IClient DAO;

	public void addOrUpdateClient(Client client) {
		DAO.save(client);
	}

	public void deleteClient(int id) {
		DAO.deleteById(id);
	}

	public List<Client> getAllClients() {
		return DAO.findAll();
	}
	
	public Optional<Client> getClient(int id){
		return DAO.findById(id);
	}
	
	public List<Exercices> getExercicesOfCient(Client client){
		return client.getLikedExercices();
	}
	
	public List<Maladie> getMaladieOfClient(Client client){
		return client.getMaladiesOfClient();
	}
	
	public List<Meals> getMealsOfClient(Client client){
		return client.getMealsOfClient();
	}
	
	
}
