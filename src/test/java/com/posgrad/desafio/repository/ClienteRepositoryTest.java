package com.posgrad.desafio.repository;

import com.posgrad.desafio.model.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

@DataJpaTest
class ClienteRepositoryTest {

    @Autowired
    private ClienteRepository clienteRepository;

    @Test
    void findByNome_DeveRetornarClientesComNomeEspecifico() {
        Cliente cliente = new Cliente(null, "João", "joao@email.com");
        clienteRepository.save(cliente);

        List<Cliente> resultado = clienteRepository.findByNome("João");

        Assertions.assertFalse(resultado.isEmpty());
        Assertions.assertEquals("João", resultado.getFirst().getNome());
    }

    @Test
    void deleteById_DeveRemoverCliente() {
        Cliente cliente = new Cliente(null, "Maria", "maria@email.com");
        Cliente salvo = clienteRepository.save(cliente);

        clienteRepository.deleteById(salvo.getId());

        Optional<Cliente> resultado = clienteRepository.findById(salvo.getId());
        Assertions.assertTrue(resultado.isEmpty());
    }
}
