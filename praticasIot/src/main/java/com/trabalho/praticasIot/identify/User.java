package com.trabalho.praticasIot.identify;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table(name="user")
@Entity(name="user")
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	private String name;
	private String uuid;
	private Date dtBirth;
	private String cpf;
	
	
	public User(String name, String uuid, Date dtBirth, String cpf) {
		this.name=name;
		this.uuid=uuid;
		this.dtBirth=dtBirth;
		this.cpf=cpf;
	}
	
	public  User() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Date getDtBirth() {
		return dtBirth;
	}

	public void setDtBirth(Date dtBirth) {
		this.dtBirth = dtBirth;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	

}
