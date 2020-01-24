package com.example.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class TypeOfExercice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Label;

	@OneToMany(mappedBy = "typeOfExercice")
	private List<Exercices> exercices;

	public TypeOfExercice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

	public List<Exercices> getExercices() {
		return exercices;
	}

	public void setExercices(List<Exercices> exercices) {
		this.exercices = exercices;
	}

}
