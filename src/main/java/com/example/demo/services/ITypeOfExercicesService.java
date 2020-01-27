package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Exercices;
import com.example.demo.entities.TypeOfExercice;

public interface ITypeOfExercicesService {
	
	public void addOrUpdateTypeOfExercices(TypeOfExercice typeOfExercice);
	
	public void deleteTypeOfExercices(int id);
	
	public List<TypeOfExercice> getAllTypesOfExercices();
	
	public Optional<TypeOfExercice> getOneTypeOfExercice(int id);
	
	public List<Exercices> getExercicesOfType(TypeOfExercice typeOfExe);

}
