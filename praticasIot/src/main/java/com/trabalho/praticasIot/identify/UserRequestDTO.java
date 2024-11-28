package com.trabalho.praticasIot.identify;

import java.sql.Date;

public record UserRequestDTO(String name, String uuid, Date dtBirth, String cpf) {

}
