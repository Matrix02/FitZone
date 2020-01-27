package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Exercices;
import com.example.demo.entities.TypeOfExercice;
import com.example.demo.entities.DAO.ITypeOfExercice;

@Service
public class TypeOfExercicesService implements ITypeOfExercicesService{
	
	@Autowired
	ITypeOfExercice DAO;
	
	public void addOrUpdateTypeOfExercices(TypeOfExercice typeOfExercice) {
		DAO.save(typeOfExercice);
	}
	
	public void deleteTypeOfExercices(int id) {
		DAO.deleteById(id);
	}
	
	public List<TypeOfExercice> getAllTypesOfExercices(){
		return DAO.findAll();
	}
	
	public Optional<TypeOfExercice> getOneTypeOfExercice(int id){
		return DAO.findById(id);
	}
	
	public List<Exercices> getExercicesOfType(TypeOfExercice typeOfExe){
		return typeOfExe.getExercices();
	}

}
