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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "User")
public class Client extends User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private MultipartFile[] photo;
	private String age;
	private String hieght;
	private String wieght;
	private String activity;
	//test
	@ManyToMany
	@JoinTable(name = "Client_Exercices", joinColumns = @JoinColumn(name = "client_id"), inverseJoinColumns = @JoinColumn(name = "exercice_id"))
	List<Exercices> likedExercices;

	@ManyToMany
	@JoinTable(name = "Client_Maladie", joinColumns = @JoinColumn(name = "client_id"), inverseJoinColumns = @JoinColumn(name = "maladie_id"))
	
	List<Maladie> maladiesOfClient;

	@ManyToMany
	@JoinTable(name = "Client_Meals", joinColumns = @JoinColumn(name = "client_id"), inverseJoinColumns = @JoinColumn(name = "meal_id"))
	List<Meals> mealsOfClient;


	@ManyToMany
	@JoinTable(name = "Client_Food", joinColumns = @JoinColumn(name = "client_id"), inverseJoinColumns = @JoinColumn(name = "food_id"))
	List<Food> foodOfClient;
	

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

	public List<Exercices> getLikedExercices() {
		return likedExercices;
	}

	public void setLikedExercices(List<Exercices> likedExercices) {
		this.likedExercices = likedExercices;
	}

	public List<Maladie> getMaladiesOfClient() {
		return maladiesOfClient;
	}

	public void setMaladiesOfClient(List<Maladie> maladiesOfClient) {
		this.maladiesOfClient = maladiesOfClient;
	}

	public List<Meals> getMealsOfClient() {
		return mealsOfClient;
	}

	public void setMealsOfClient(List<Meals> mealsOfClient) {
		this.mealsOfClient = mealsOfClient;
	}

	public List<Food> getFoodOfClient() {
		return foodOfClient;
	}

	public void setFoodOfClient(List<Food> foodOfClient) {
		this.foodOfClient = foodOfClient;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MultipartFile[] getPhoto() {
		return photo;
	}

	public void setPhoto(MultipartFile[] photo) {
		this.photo = photo;
	}

}
