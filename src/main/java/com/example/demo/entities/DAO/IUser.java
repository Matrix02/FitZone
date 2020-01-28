package com.example.demo.entities.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.User;



public interface IUser extends JpaRepository<User, Integer> {

	User findByUsername(String username);
}
