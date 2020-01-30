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

import com.example.demo.entities.Food;
import com.example.demo.entities.FoodSpecialist;
import com.example.demo.entities.Maladie;
import com.example.demo.entities.Meals;
import com.example.demo.entities.TypeOfFood;
import com.example.demo.entities.TypeOfMeal;
import com.example.demo.services.IFoodService;
import com.example.demo.services.IFoodSpecialistService;
import com.example.demo.services.IMaladieService;
import com.example.demo.services.IMealService;
import com.example.demo.services.ITypeOfFoodService;
import com.example.demo.services.ITypeOfMealService;

@RestController
@RequestMapping("/api/foodSpecialist")
@CrossOrigin(origins = "http://localhost:4200")
public class FoodSpecialistController {

	@Autowired
	IFoodSpecialistService foodSpeService;

	// ADD or DELETE FoodSpecialist

	@PostMapping("/addFoodSpecialist")
	public void saveFoodSpecialist(@RequestBody FoodSpecialist foodSpecialist) {
		System.out.println(foodSpecialist);
		
		foodSpeService.addOrUpdateFoodSpecialist(foodSpecialist);
		
	}

	@DeleteMapping("/deleteFoodSpesialist/{id}")
	public void deleteFoodSpesialist(@PathVariable("id") int id) {
		foodSpeService.deleteFoodSpecialist(id);
	}

	// CRUD Meals

	@Autowired
	IMealService mealService;

	@PostMapping("/AddMeals")
	public void addMeals(Meals meal) {
		mealService.addOrUpdateMeal(meal);
	}

	@DeleteMapping("/deleteMeals/{id}")
	public void deleteMeal(@PathVariable("id") int id) {
		mealService.deleteMeal(id);
	}

	// get All The Meals he or she added

	@GetMapping("/MealsOfFoodSpecialist")
	public List<Meals> selectMealsOfFoodSpecialist(FoodSpecialist foodSpeacialist) {
		return foodSpeService.getMealsOfFoodSpecialist(foodSpeacialist);
	}

	// Get ALL Types Of Meals

	@Autowired
	ITypeOfMealService typeOfMealsService;

	@GetMapping("/typeOfMeals")
	public List<TypeOfMeal> getAllTypesOfMeals() {
		return typeOfMealsService.getAllTypesOfMeals();
	}

	// CRUD food

	@Autowired
	IFoodService foodService;

	@PostMapping("/addFood")
	public void addFood(Food food) {
		foodService.addOrUpdateFood(food);
	}

	@DeleteMapping("/deleteFood/{id}")
	public void deleteFood(int id) {
		foodService.deleteFood(id);
	}

	// Get and Set ALL Types Of Food

	@GetMapping("/GetTypeOfFood")
	public List<TypeOfFood> getAllTypeOfFood(Food food) {
		return foodService.getTypeOfFood(food);
	}

	@Autowired
	ITypeOfFoodService typeOfFoodService;

	@PostMapping("/addTypefsOfFood")
	public void addTypeOfFood(TypeOfFood typeOfFood) {
		typeOfFoodService.addOrUpdate(typeOfFood);
	}

	// Get and Set Maladies

	@Autowired
	IMaladieService maladieService;

	@GetMapping("/GetMaladie")
	public List<Maladie> getAllMaladies() {
		return maladieService.getAllMaladies();
	}

	@PostMapping("/setMaladie")
	public void setMaladies(Maladie maladie) {
		maladieService.addOrUpDateMaladie(maladie);
	}

}
