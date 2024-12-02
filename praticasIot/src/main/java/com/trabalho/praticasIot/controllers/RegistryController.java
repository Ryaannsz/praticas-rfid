package com.trabalho.praticasIot.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
