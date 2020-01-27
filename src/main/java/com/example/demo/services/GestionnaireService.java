package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Gestionnaire;
import com.example.demo.entities.DAO.IGestionnaire;

@Service
public class GestionnaireService implements IGestionnaireService {

	@Autowired
	IGestionnaire DAO;

	public void addOrUpdateGestionnaire(Gestionnaire gestionnaire) {
		DAO.save(gestionnaire);
	}

	public void deleteGestionnaire(int id) {
		DAO.deleteById(id);
	}

	public List<Gestionnaire> getAllGestionnaire() {
		return DAO.findAll();
	}
	
	public Optional<Gestionnaire> getGetionnaire(int id){
		return DAO.findById(id);
	}
	
	
}
