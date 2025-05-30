package org.example.repository;

import org.example.model.EnderecoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EnderecoRepository extends JpaRepository<EnderecoModel, Integer> {

    List<EnderecoModel> findByCep(String pCep);

    Optional<EnderecoModel> findByComplemento(String pComplemento);
}
