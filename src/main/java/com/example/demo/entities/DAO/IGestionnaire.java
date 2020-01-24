package com.example.demo.entities.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Gestionnaire;

public interface IGestionnaire extends JpaRepository<Gestionnaire, Integer> {

}
