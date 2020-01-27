package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Client;
import com.example.demo.entities.Exercices;
import com.example.demo.entities.Food;
import com.example.demo.entities.Maladie;
import com.example.demo.entities.Meals;
import com.example.demo.entities.TypeOfFood;
import com.example.demo.services.IClientService;
import com.example.demo.services.IFoodService;
import com.example.demo.services.IMaladieService;


@CrossOrigin
@RestController
@RequestMapping("api/cient")
public class ClientController {

	@Autowired
	IClientService service;
	
	@PostMapping("addClient")
	public void saveClient(@RequestBody Client client) {
		service.addOrUpdateClient(client);
	}
	
	@DeleteMapping("deleteCliet/{id}")
	public void deleteClient(@PathVariable("id") int id) {
		service.deleteClient(id);
	}
	
	@GetMapping("exercicesOfClient")
	public List<Exercices> selectExercicesOfClient(Client client){
		return service.getExercicesOfCient(client);
	}
	
	@GetMapping("mealsOfClient")
	public List<Meals> selectMealsOfClient(Client client){
		return service.getMealsOfClient(client);
	}
	
	@GetMapping("madaliesOfCleint")
	public List<Maladie> selectMaladiesOfClient(Client client){
		return service.getMaladieOfClient(client);
	}
	
	// Get ALL Maladies
	
	@Autowired
	IMaladieService maladieService;

	@GetMapping("GetMaladie")
	public List<Maladie> getAllMaladies() {
		return maladieService.getAllMaladies();
	}
	
	
	// CRUD food

	@Autowired
	IFoodService foodService;

	@GetMapping("GetTypeOfFood")
	public List<TypeOfFood> getAllTypeOfFood(Food food) {
		return foodService.getTypeOfFood(food);
	}
}
