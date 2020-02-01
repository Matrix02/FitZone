package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import com.example.demo.entities.Coach;
import com.example.demo.entities.Exercices;
import com.example.demo.entities.Role;
import com.example.demo.entities.DAO.ICoach;

@Service
public class CoachService implements ICoachService {
	
	@Autowired
	ICoach DAO;
	
	BCryptPasswordEncoder bcryptEncoder = new BCryptPasswordEncoder();
	
	public void addOrUpdateCloach(Coach coach) {
		coach.setPassword(bcryptEncoder.encode(coach.getPassword()));
		Role role = new Role();
		role.setId(3);
		coach.setRole(role);
		DAO.save(coach);
	}
	
	public void deleteCoach(int id) {
		DAO.deleteById(id);
	}
	
	public List<Coach> getAllCoachs(){
		return DAO.findAll();
	}
	
	public Optional<Coach> getCoach(int id){
		return DAO.findById(id);
	}
	
	public boolean checkCoachApprove(Coach coach) {
		return coach.isApproval();
	}
	
	public Coach approveCoach(Coach coach) {
		coach.setApproval(true);
		return DAO.save(coach);
	}
	
	public List<Exercices> getAllExercicesOfCoach(Coach coach){
		return coach.getExercicesOfCoach();
	}

}
