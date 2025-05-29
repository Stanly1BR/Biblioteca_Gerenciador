package org.example.repository;

import org.example.model.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroRepository extends JpaRepository<LivroModel, Integer> {

    List<LivroModel> findByTitulo(String pTitulo);

    List<LivroModel> findByAutor(String pAutor);

    List<LivroModel> findByDataPublicacao(String pDataPublicacao);
}
