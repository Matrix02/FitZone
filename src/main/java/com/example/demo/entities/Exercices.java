package com.example.demo.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Exercices {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String photo;
	private String description;
	
	@ManyToOne
    @JoinColumn(name = "fk_Coach")
	private Coach coach;
	
	@ManyToOne
    @JoinColumn(name = "fk_TypeOfExe")
	private TypeOfExercice typeOfExercice;
	
	@ManyToMany(mappedBy = "likedExercices")
    Set<Client> exercicesOfClient;
	
	public Exercices() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Coach getCoach() {
		return coach;
	}
	public void setCoach(Coach coach) {
		this.coach = coach;
	}
	public TypeOfExercice getTypeOfExercice() {
		return typeOfExercice;
	}
	public void setTypeOfExercice(TypeOfExercice typeOfExercice) {
		this.typeOfExercice = typeOfExercice;
	}

	public Set<Client> getExercicesOfClient() {
		return exercicesOfClient;
	}

	public void setExercicesOfClient(Set<Client> exercicesOfClient) {
		this.exercicesOfClient = exercicesOfClient;
	}
	
}
