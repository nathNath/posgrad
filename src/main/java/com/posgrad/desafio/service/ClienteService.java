package com.posgrad.desafio.service;

import com.posgrad.desafio.model.Cliente;
import com.posgrad.desafio.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Classe com a responsabilidade de implementar a regra de negocio e interagir  com o repository do projeto.
 *
 * @author nath
 * @since 2025
 */
@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }
    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }
    public List<Cliente> buscarPorNome(String nome) {
        return clienteRepository.findByNome(nome);
    }
    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }
    public long contarClientes() {
        return clienteRepository.count();
    }
}