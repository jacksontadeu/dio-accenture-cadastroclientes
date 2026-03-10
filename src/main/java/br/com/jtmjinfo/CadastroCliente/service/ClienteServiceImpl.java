package br.com.jtmjinfo.CadastroCliente.service;

import br.com.jtmjinfo.CadastroCliente.client.ViacepClient;
import br.com.jtmjinfo.CadastroCliente.model.Cliente;
import br.com.jtmjinfo.CadastroCliente.repository.ClienteRepository;
import br.com.jtmjinfo.CadastroCliente.repository.EnderecoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService{

    private final ClienteRepository cliRepo;
    private final ViacepClient viacepClient;
    private final EnderecoRepository endRepo;

    public ClienteServiceImpl(ClienteRepository cliRepo, ViacepClient viacepClient, EnderecoRepository endRepo) {
        this.cliRepo = cliRepo;
        this.viacepClient = viacepClient;
        this.endRepo = endRepo;
    }

    @Override
    public void adicionarCliente(Cliente cliente) {
        cliRepo.save(cliente);
    }

    @Override
    public Iterable<Cliente> buscarTodos() {
        return cliRepo.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente= cliRepo.findById(id);
        if(cliente.isPresent()){
            return cliente.get();
        }

        throw new ResponseStatusException
                (HttpStatus.NOT_FOUND, "Usuário não encontrado!!!");

    }

    @Override
    public Cliente atualizarCliente(Long id, Cliente cliente) {
        return null;
    }

    @Override
    public void deletarcliente(Long ud) {

    }
}
