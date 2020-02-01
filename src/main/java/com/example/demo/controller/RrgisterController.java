package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Client;
import com.example.demo.entities.Coach;
import com.example.demo.entities.FoodSpecialist;
import com.example.demo.services.IClientService;
import com.example.demo.services.ICoachService;
import com.example.demo.services.IFoodSpecialistService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/register")
public class RrgisterController {

	
	@Autowired
	IClientService Clientservice;
	@Autowired
	ICoachService coachService;
	@Autowired
	IFoodSpecialistService foodSpeService;
	
	
	@PostMapping("/addFoodSpecialist")
	public void saveFoodSpecialist(@RequestBody FoodSpecialist foodSpecialist) {
		System.out.println(foodSpecialist);
		
		foodSpeService.addOrUpdateFoodSpecialist(foodSpecialist);
		
	}
	@PostMapping("/addClient")
	public void saveClient(@RequestBody Client client) {
		Clientservice.addOrUpdateClient(client);
	}
	
	
	@PostMapping("/addCoach")
	public void saveCoach(@RequestBody Coach coach) {
		coachService.addOrUpdateCloach(coach);
	}
	
	
	
	
	
	
	
}
