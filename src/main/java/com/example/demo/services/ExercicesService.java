package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Coach;
import com.example.demo.entities.Exercices;
import com.example.demo.entities.TypeOfExercice;
import com.example.demo.entities.DAO.IExercices;

@Service
public class ExercicesService implements IExercicesService {

	@Autowired
	IExercices DAO;
	
	public void addOrUpdateExercice(Exercices exercice) {
		DAO.save(exercice);
	}
	
	public void deleteExercice(int id) {
		DAO.deleteById(id);
	}
	
	public List<Exercices> getAllExercices(){
		return DAO.findAll();
	}
	
	public Optional<Exercices> getExercice(int id){
		return DAO.findById(id);
	}
	
	public Coach getCoachOfExercice(Exercices exercice) {
		return exercice.getCoach();
	}
	
	public TypeOfExercice getTypeOfExercice(Exercices exercice) {
		return exercice.getTypeOfExercice();
	}
}
