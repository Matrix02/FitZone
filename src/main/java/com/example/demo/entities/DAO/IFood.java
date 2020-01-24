package com.example.demo.entities.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Food;

public interface IFood extends JpaRepository<Food, Integer>{

}
