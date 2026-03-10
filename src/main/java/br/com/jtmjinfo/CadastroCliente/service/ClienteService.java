package br.com.jtmjinfo.CadastroCliente.service;

import java.util.Optional;

import br.com.jtmjinfo.CadastroCliente.model.Cliente;



public interface ClienteService {

    void adicionarCliente(Cliente cliente);

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    Cliente atualizarCliente(Long id, Cliente cliente);

    void deletarcliente(Long ud);

}
