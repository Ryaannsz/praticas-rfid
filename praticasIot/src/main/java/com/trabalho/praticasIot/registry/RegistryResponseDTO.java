package com.trabalho.praticasIot.registry;

import java.sql.Date;

public record RegistryResponseDTO(Long code, String uuid, Date dtRegistry, boolean situation) {
	public RegistryResponseDTO(Registry registry) {
		this(registry.getCode(), registry.getUuid(), registry.getDtRegistry(), registry.isSituation());
	}
}


