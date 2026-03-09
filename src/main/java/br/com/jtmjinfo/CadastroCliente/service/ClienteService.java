package br.com.jtmjinfo.CadastroCliente.service;

import br.com.jtmjinfo.CadastroCliente.model.Cliente;

import java.util.List;


public interface ClienteService {

    void adicionarCliente(Cliente cliente);

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    Cliente atualizarCliente(Long id, Cliente cliente);

    void deletarcliente(Long ud);

}
