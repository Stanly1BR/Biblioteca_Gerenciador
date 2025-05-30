package org.example.rost.dto;

import jakarta.persistence.*;

@Table(name = "Endereco")
public class EnderecoDTO {

    private int id;

    private String cep;

    private String cidade;

    private String estado;

    private String bairro;

    private String rua;

    private String numero;

    private String complemento;

}

