package com.trabalho.praticasIot.registry;


import java.sql.Date;

public record RegistryRequestDTO(String uuid, Date dtRegistry, boolean situation) {

}
