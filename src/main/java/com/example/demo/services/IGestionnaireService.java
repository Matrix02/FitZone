package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Gestionnaire;

public interface IGestionnaireService {
	
	public void addOrUpdateGestionnaire(Gestionnaire gestionnaire);

	public void deleteGestionnaire(int id);

	public List<Gestionnaire> getAllGestionnaire();
	
	public Optional<Gestionnaire> getGetionnaire(int id);

}
