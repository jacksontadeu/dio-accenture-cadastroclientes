package br.com.jtmjinfo.CadastroCliente.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jtmjinfo.CadastroCliente.model.Cliente;
import br.com.jtmjinfo.CadastroCliente.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public ResponseEntity<String> cadastrarCliente(@RequestBody Cliente cliente){
        clienteService.adicionarCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body("Cliente criado com sucesso!!!");

    }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id){
       Optional<Cliente> cliente= Optional.ofNullable(clienteService.buscarPorId(id));
       return ResponseEntity.status(HttpStatus.OK).body(cliente.get());
        
        
    }
    @GetMapping
    public ResponseEntity<Iterable<Cliente>> buscarTodos(){
        Iterable<Cliente> clientes = clienteService.buscarTodos();
        return ResponseEntity.status(HttpStatus.OK).body(clientes);

    }
}
