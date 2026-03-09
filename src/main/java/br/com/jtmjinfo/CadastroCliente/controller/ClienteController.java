package br.com.jtmjinfo.CadastroCliente.controller;

import br.com.jtmjinfo.CadastroCliente.model.Cliente;
import br.com.jtmjinfo.CadastroCliente.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    public ResponseEntity cadastrarCliente(Cliente cliente){
        clienteService.cadastrarCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body("Cliente criado com sucesso!!!");

    }
}
