package org.example.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.example.rost.dto.UsuarioDTO;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;
import org.modelmapper.ModelMapper;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome", length = 35, nullable = false)
    @NotNull(message = "O campo nome não pode ser vazio")
    @NotBlank(message = "O campo nome não pode ser branco")
    private  String nome;

    @Column(name = "Telefone", length = 11, nullable = false)
    @NotNull(message = "O campo telefone não pode ser vazio")
    @NotBlank(message = "O campo telefone não pode ser branco")
    @Length(min = 11)
    private String telefone;

    @Column(name = "cpf", length = 11, nullable = false, unique = true)
    @NotNull(message = "O campo cpf não pode ser vazio")
    @NotBlank(message = "O campo cpf não pode ser branco")
    @CPF(message = "CPF invalido")
    private String cpf;

    @Column(name = "EnderecoID")
    private int EnderecoID;

    public UsuarioDTO toDTO(){
        ModelMapper m = new ModelMapper();
        return m.map(this, UsuarioDTO.class);
    }
}
