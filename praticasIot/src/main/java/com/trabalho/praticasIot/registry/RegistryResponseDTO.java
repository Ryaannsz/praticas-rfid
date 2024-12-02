package com.trabalho.praticasIot.registry;


import java.sql.Date;
import java.sql.Timestamp;

public record RegistryResponseDTO(Long code, String uuid, Timestamp dtRegistry, boolean situation) {
	public RegistryResponseDTO(Registry registry) {
		this(registry.getCode(), registry.getUuid(), registry.getDtRegistry(), registry.isSituation());
	}
}


