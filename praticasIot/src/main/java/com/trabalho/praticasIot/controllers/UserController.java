package com.trabalho.praticasIot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabalho.praticasIot.identify.UserResponseDTO;
import com.trabalho.praticasIot.repository.UserRepository;

@RestController
@RequestMapping("user")
public class UserController {

	
	@Autowired
	UserRepository userRepository;
	
	@CrossOrigin(origins="*", allowedHeaders = "*")
	@GetMapping
	public List<UserResponseDTO> getUser(){
		
		List<UserResponseDTO> listUser = userRepository.findAll().stream().map(UserResponseDTO::new).toList();
		return listUser;
	}
}
