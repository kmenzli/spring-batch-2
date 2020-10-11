package org.training.spring.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ActeurDto {
    String nom, prenom, email, ville, pays, codePostae;
    Integer nombreAchat;
    Date dateNaissance;
}

