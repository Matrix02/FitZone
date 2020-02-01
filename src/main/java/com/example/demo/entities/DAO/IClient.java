package com.example.demo.entities.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Client;
import com.example.demo.entities.User;

public interface IClient extends JpaRepository<Client, Integer> {


}
