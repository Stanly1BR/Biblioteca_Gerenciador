package org.example.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.rost.dto.LivroDTO;
import org.modelmapper.ModelMapper;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Livro")
public class LivroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "titulo", length = 50, nullable = false)
    @NotNull(message = "O campo titulo não pode ser vazio")
    @NotBlank(message = "O campo titulo não pode ser branco")
    private String titulo;

    @Column(name = "autor", length = 35, nullable = false)
    @NotNull(message = "O campo autor não pode ser vazio")
    @NotBlank(message = "O campo autor não pode ser branco")
    private String autor;

    @Column(name = "dataPublicacao", length = 10)
    @NotBlank(message = "O campo data de publicação não pode ser branco")
    private String dataPublicacao;

    public LivroDTO toDTO(){
        ModelMapper m = new ModelMapper();
        return m.map(this, LivroDTO.class);
    }
}
