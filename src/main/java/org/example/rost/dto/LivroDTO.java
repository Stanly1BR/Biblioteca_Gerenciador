package org.example.rost.dto;

import lombok.Data;


@Data
public class LivroDTO {

    private int id;

    private String titulo;

    private String autor;

    private String dataPublicacao;
}
