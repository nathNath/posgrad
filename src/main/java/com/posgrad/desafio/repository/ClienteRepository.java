package com.posgrad.desafio.repository;

import com.posgrad.desafio.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Interface com a responsabilidade de comunicar com a camada de persistencia do projeto.
 *
 * @author nath
 * @since 2025
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByNome(String nome);

}
