package com.trabalho.praticasIot.identify;

import java.sql.Date;

public record UserResponseDTO(Long userId, String name, String uuid, Date dtBirth, String cpf) {
	public UserResponseDTO(User user) {
		this(user.getUserId(), user.getName(), user.getUuid(), user.getDtBirth(), user.getCpf());
	}
}

