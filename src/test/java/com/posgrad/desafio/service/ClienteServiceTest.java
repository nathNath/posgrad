package com.posgrad.desafio.service;

import com.posgrad.desafio.model.Cliente;
import com.posgrad.desafio.repository.ClienteRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ClienteServiceTest {

    @Mock
    private ClienteRepository clienteRepository;

    @InjectMocks
    private ClienteService clienteService;

    @Test
    void listarTodos_DeveRetornarListaDeClientes() {
        List<Cliente> clientes = List.of(new Cliente(1L, "João", "joao@email.com"));
        Mockito.when(clienteRepository.findAll()).thenReturn(clientes);

        List<Cliente> resultado = clienteService.listarTodos();

        Assertions.assertEquals(1, resultado.size());
        Assertions.assertEquals("João", resultado.get(0).getNome());
    }

    @Test
    void salvar_DeveSalvarCliente() {
        Cliente cliente = new Cliente(null, "Maria", "maria@email.com");
        Mockito.when(clienteRepository.save(Mockito.any(Cliente.class))).thenReturn(cliente);

        Cliente resultado = clienteService.salvar(cliente);

        Assertions.assertNotNull(resultado);
        Assertions.assertEquals("Maria", resultado.getNome());
    }
}
