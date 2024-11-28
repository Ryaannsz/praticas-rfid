package com.trabalho.praticasIot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trabalho.praticasIot.registry.Registry;

public interface RegistryRepository extends JpaRepository<Registry, Long>{

}
