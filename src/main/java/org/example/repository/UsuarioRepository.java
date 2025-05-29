package org.example.repository;

import org.example.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {

    List<UsuarioModel> findByNome(String pNome);

    List<UsuarioModel> findByTelefone(String pTelefone);
}
