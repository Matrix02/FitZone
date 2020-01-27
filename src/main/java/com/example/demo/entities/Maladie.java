package com.example.demo.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Maladie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String description;

	@ManyToMany(mappedBy = "maladiesOfClient")
	List<Client> maladiesOfClient;

	@ManyToMany
	@JoinTable(name = "Maladie_Meals", joinColumns = @JoinColumn(name = "maladie_id"), inverseJoinColumns = @JoinColumn(name = "meal_id"))
	List<Meals> maladiesOFMeals;

	public Maladie() {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Client> getMaladiesOfClient() {
		return maladiesOfClient;
	}

	public void setMaladiesOfClient(List<Client> maladiesOfClient) {
		this.maladiesOfClient = maladiesOfClient;
	}

	public List<Meals> getMaladiesOFMeals() {
		return maladiesOFMeals;
	}

	public void setMaladiesOFMeals(List<Meals> maladiesOFMeals) {
		this.maladiesOFMeals = maladiesOFMeals;
	}

}
