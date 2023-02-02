package com.teste.testeTecnico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.testeTecnico.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository <Endereco,Long> {
	public List <Endereco> findAllByLogradouroContainingIgnoreCase (String logradouro);
}
