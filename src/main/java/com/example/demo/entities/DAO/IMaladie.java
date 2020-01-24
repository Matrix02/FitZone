package com.example.demo.entities.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Maladie;

public interface IMaladie extends JpaRepository<Maladie, Integer> {

}
