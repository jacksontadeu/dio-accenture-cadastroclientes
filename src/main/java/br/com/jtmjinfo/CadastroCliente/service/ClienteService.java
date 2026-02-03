package br.com.jtmjinfo.CadastroCliente.service;

import br.com.jtmjinfo.CadastroCliente.model.Cliente;
import br.com.jtmjinfo.CadastroCliente.repository.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void cadastrarCliente(Cliente cliente){
        clienteRepository.save(cliente);
    }
}
