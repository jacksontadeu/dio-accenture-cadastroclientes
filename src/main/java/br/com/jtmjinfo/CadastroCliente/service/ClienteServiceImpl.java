package br.com.jtmjinfo.CadastroCliente.service;

import br.com.jtmjinfo.CadastroCliente.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService{
    @Override
    public void adicionarCliente(Cliente cliente) {

    }

    @Override
    public List<Cliente> buscarTodos() {
        return List.of();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public Cliente atualizarCliente(Long id, Cliente cliente) {
        return null;
    }

    @Override
    public void deletarcliente(Long ud) {

    }
}
