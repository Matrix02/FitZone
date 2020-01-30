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

import com.example.demo.entities.Coach;
import com.example.demo.entities.Exercices;
import com.example.demo.entities.Role;
import com.example.demo.services.ICoachService;
import com.example.demo.services.IExercicesService;

import javassist.NotFoundException;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/coach")
public class CoachController {

	@Autowired
	ICoachService coachService;
	
	@PostMapping("/addCoach")
	public void saveCoach(@RequestBody Coach coach) {
		coachService.addOrUpdateCloach(coach);
	}

	@DeleteMapping("/deleteCoach/{id}")
	public void deleteCoach(@PathVariable("id") int id) {
		coachService.deleteCoach(id);
	}
	
	//CRUD Exercices
	
	@Autowired
	IExercicesService ExerciesService;
	
	@PostMapping("/addExercice")
	public void saveExercice(@RequestBody Exercices exercice) {
		ExerciesService.addOrUpdateExercice(exercice);
	}
	
	@DeleteMapping("/deleteExercice/{id}")
	public void deleteExercice(@PathVariable("id") int id) {
		ExerciesService.deleteExercice(id);
	}
	
	@GetMapping("/execicesOfCoach")
	public List<Exercices> getExerciceOfCoach(Coach coach){
		return coachService.getAllExercicesOfCoach(coach);
	}
}
