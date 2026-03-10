package br.com.jtmjinfo.CadastroCliente.repository;

import br.com.jtmjinfo.CadastroCliente.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository  extends JpaRepository<Cliente, Long> {


}
