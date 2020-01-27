package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Coach;
import com.example.demo.entities.Exercices;
import com.example.demo.entities.TypeOfExercice;

public interface IExercicesService {
	
	public void addOrUpdateExercice(Exercices exercice);
	
	public void deleteExercice(int id);
	
	public List<Exercices> getAllExercices();
	
	public Optional<Exercices> getExercice(int id);
	
	public Coach getCoachOfExercice(Exercices exercice);
	
	public TypeOfExercice getTypeOfExercice(Exercices exercice);

}
