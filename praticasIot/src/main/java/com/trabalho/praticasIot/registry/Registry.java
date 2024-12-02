package com.trabalho.praticasIot.registry;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="registry")
@Entity(name="registry")
public class Registry {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long code;
	private String uuid;
	private Date dtRegistry;
	private boolean situation;
	
	public Registry(String uuid, Date dtRegistry, boolean situation) {

		this.uuid=uuid;
		this.dtRegistry=dtRegistry;
		this.situation=situation;
	}
	
	public Registry() {
		
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Date getDtRegistry() {
		return dtRegistry;
	}

	public void setDtRegistry(Date dtRegistry) {
		this.dtRegistry = dtRegistry;
	}

	public boolean isSituation() {
		return situation;
	}

	public void setSituation(boolean situation) {
		this.situation = situation;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}
	
	
}
