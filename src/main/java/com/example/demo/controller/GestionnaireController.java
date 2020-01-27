package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Client;
import com.example.demo.entities.Coach;
import com.example.demo.entities.FoodSpecialist;
import com.example.demo.services.IClientService;
import com.example.demo.services.ICoachService;
import com.example.demo.services.IFoodSpecialistService;

@CrossOrigin
@RestController
@RequestMapping("api/gestionnaire")
public class GestionnaireController {
	
	//Get ALL and delete clients

	@Autowired
	IClientService clientService;
	
	@GetMapping("getClients")
	public List<Client> getAllClients(){
		return clientService.getAllClients();
	}
	
	@DeleteMapping("deleteClient/{id}")
	public void deleteClient(@PathVariable("id") int id) {
		clientService.deleteClient(id);
	}
	
	//Get ALL, DELETE and Accept FoodSpecialist
	
	@Autowired
	IFoodSpecialistService foodSpeService;
	
	@GetMapping("getAllFoodSpecialist")
	public List<FoodSpecialist> getAllFoodSpecialist(){
		return foodSpeService.getAllFoodSpecialist();
	}
	
	@DeleteMapping("deleteFoodSpecialist/{id}")
	public void deleteFoodSpecialist(@PathVariable("id") int id) {
		foodSpeService.deleteFoodSpecialist(id);
	}
	
	@PostMapping("approveFoodSpecialist/{id}")
	public void approveFoodSpecialist(@PathVariable("id") int id) {
		foodSpeService.approveFoodSpecialist(foodSpeService.getFoodSpecialist(id).get());
	}
	
	
	//get ALL, DELETE and accept Coach
	
	@Autowired
	ICoachService coachSrvice;
	
	@GetMapping("getAllCoaches")
	public List<Coach> getAllCoaches(){
		return coachSrvice.getAllCoachs();
	}
	
	@DeleteMapping("deleteCoach/{id}")
	public void deltecoach(@PathVariable("id") int id) {
		coachSrvice.deleteCoach(id);
	}
	
	@PostMapping("approveCoach/{id}")
	public void approveCoach(@PathVariable("id") int id) {
		coachSrvice.approveCoach(coachSrvice.getCoach(id).get());
	}
	
}
