package com.example.demo.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Client extends User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String photo;
	private String age;
	private String hieght;
	private String wieght;
	private String activity;
	//test
	@ManyToMany
	@JoinTable(name = "Client_Exercices", joinColumns = @JoinColumn(name = "client_id"), inverseJoinColumns = @JoinColumn(name = "exercice_id"))
	Set<Exercices> likedExercices;

	@ManyToMany
	@JoinTable(name = "Client_Maladie", joinColumns = @JoinColumn(name = "client_id"), inverseJoinColumns = @JoinColumn(name = "maladie_id"))
	
	Set<Maladie> maladiesOfClient;

	@ManyToMany
	@JoinTable(name = "Client_Meals", joinColumns = @JoinColumn(name = "client_id"), inverseJoinColumns = @JoinColumn(name = "meal_id"))
	Set<Meals> mealsOfClient;


	@ManyToMany
	@JoinTable(name = "Client_Food", joinColumns = @JoinColumn(name = "client_id"), inverseJoinColumns = @JoinColumn(name = "food_id"))
	Set<Food> foodOfClient;
	

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getHieght() {
		return hieght;
	}

	public void setHieght(String hieght) {
		this.hieght = hieght;
	}

	public String getWieght() {
		return wieght;
	}

	public void setWieght(String wieght) {
		this.wieght = wieght;
	}

	public Set<Food> getFoodOfClient() {
		return foodOfClient;
	}

	public void setFoodOfClient(Set<Food> foodOfClient) {
		this.foodOfClient = foodOfClient;
	}

	public Set<Exercices> getLikedExercices() {
		return likedExercices;
	}

	public void setLikedExercices(Set<Exercices> likedExercices) {
		this.likedExercices = likedExercices;
	}

	public Set<Maladie> getMaladiesOfClient() {
		return maladiesOfClient;
	}

	public void setMaladiesOfClient(Set<Maladie> maladiesOfClient) {
		this.maladiesOfClient = maladiesOfClient;
	}

	public Set<Meals> getMealsOfClient() {
		return mealsOfClient;
	}

	public void setMealsOfClient(Set<Meals> mealsOfClient) {
		this.mealsOfClient = mealsOfClient;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
