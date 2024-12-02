package com.trabalho.praticasIot.controllers;


import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabalho.praticasIot.registry.Registry;
import com.trabalho.praticasIot.registry.RegistryRequestDTO;
import com.trabalho.praticasIot.registry.RegistryResponseDTO;
import com.trabalho.praticasIot.repository.RegistryRepository;

@RestController
@RequestMapping("registry")
public class RegistryController {
	
	@Autowired
	RegistryRepository registryRepository;
	
	@CrossOrigin(origins="*", allowedHeaders = "*")
	@GetMapping
	public List<RegistryResponseDTO> getRegistry(){
		
		List<RegistryResponseDTO> listRegistry = registryRepository.findAll().stream().map(RegistryResponseDTO :: new).toList();
		return listRegistry;
		
	}
	@CrossOrigin(origins="*", allowedHeaders = "*")
	@PostMapping
	public void addRegistry(@RequestBody RegistryRequestDTO data) {
		
		LocalDateTime hr = LocalDateTime.now();
		Timestamp sqlHr = Timestamp.valueOf(hr);
		
		Registry registro = new Registry(data, sqlHr);
		registryRepository.save(registro);
	}

}
