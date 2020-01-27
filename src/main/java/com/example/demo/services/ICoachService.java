package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Coach;
import com.example.demo.entities.Exercices;

public interface ICoachService {
	
	public void addOrUpdateCloach(Coach coach);
	
	public void deleteCoach(int id);
	
	public List<Coach> getAllCoachs();
	
	public Optional<Coach> getCoach(int id);
	
	public boolean checkCoachApprove(Coach coach);
	
	public Coach approveCoach(Coach coach);
	
	public List<Exercices> getAllExercicesOfCoach(Coach coach);

}
