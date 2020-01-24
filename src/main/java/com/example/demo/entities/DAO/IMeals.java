package com.example.demo.entities.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Meals;

public interface IMeals extends JpaRepository<Meals, Integer>{

}
