package br.com.jtmjinfo.CadastroCliente.repository;

import br.com.jtmjinfo.CadastroCliente.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository  extends CrudRepository<Cliente, Long> {


}
