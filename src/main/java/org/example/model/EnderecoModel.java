package org.example.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.rost.dto.EnderecoDTO;
import org.modelmapper.ModelMapper;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Endereco")
public class EnderecoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "cep", length = 11, nullable = false)
    @NotNull(message = "O campo cep não pode ser vazio")
    @NotBlank(message = "O campo cep não pode ser branco")
    private String cep;

    @Column(name = "cidade", length = 35, nullable = false)
    @NotNull(message = "O campo cep não pode ser vazio")
    @NotBlank(message = "O campo cep não pode ser branco")
    private String cidade;

    @Column(name = "estado", length = 35, nullable = false)
    @NotNull(message = "O campo cep não pode ser vazio")
    @NotBlank(message = "O campo cep não pode ser branco")
    private String estado;

    @Column(name = "bairro", length = 35, nullable = false)
    @NotNull(message = "O campo cep não pode ser vazio")
    @NotBlank(message = "O campo cep não pode ser branco")
    private String bairro;

    @Column(name = "rua", length = 35, nullable = false)
    @NotNull(message = "O campo cep não pode ser vazio")
    @NotBlank(message = "O campo cep não pode ser branco")
    private String rua;

    @Column(name = "numero", length = 11)
    @NotNull(message = "O campo cep não pode ser vazio")
    @NotBlank(message = "O campo cep não pode ser branco")
    private String numero;

    @Column(name = "complemento", length = 35)
    @NotNull(message = "O campo cep não pode ser vazio")
    @NotBlank(message = "O campo cep não pode ser branco")
    private String complemento;

    public EnderecoDTO toDTO(){
        ModelMapper m = new ModelMapper();
        return m.map(this, EnderecoDTO.class);
    }
}

