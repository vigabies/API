package br.com.vigabies.vitoriaAPI.resource;

import br.com.vigabies.vitoriaAPI.Model.Cliente;
import br.com.vigabies.vitoriaAPI.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("clientes")

public class ClienteResouce {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/todos")
    public List<Cliente> ListarTodosClientes(){
        return clienteRepository.findAll();
    }
}
