package com.trabalho.praticasIot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trabalho.praticasIot.identify.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
