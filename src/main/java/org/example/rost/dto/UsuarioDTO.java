package org.example.rost.dto;

import jakarta.persistence.*;
import lombok.Data;


@Data
public class UsuarioDTO {

    private int id;

    private  String nome;

    private String telefone;
}
