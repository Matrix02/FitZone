package com.example.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class Coach extends User {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String photo;
	private String bio;
	private boolean approval = false;
	
	@OneToMany(mappedBy = "coach", fetch = FetchType.LAZY)
    private List<Exercices> exercicesOfCoach;
	
	
	public List<Exercices> getExercicesOfCoach() {
		return exercicesOfCoach;
	}

	public void setExercicesOfCoach(List<Exercices> exercicesOfCoach) {
		this.exercicesOfCoach = exercicesOfCoach;
	}
	
	public Coach() {}

	public Coach(String photo, String bio) {
		super();
		this.photo = photo;
		this.bio = bio;
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
	
	public String getBio() {
		return bio;
	}
	
	public void setBio(String bio) {
		this.bio = bio;
	}

	public boolean isApproval() {
		return approval;
	}

	public void setApproval(boolean approval) {
		this.approval = approval;
	}
	
	
	
	
}
