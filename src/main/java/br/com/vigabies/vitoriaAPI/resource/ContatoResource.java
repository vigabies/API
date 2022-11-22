package br.com.vigabies.vitoriaAPI.resource;

import br.com.vigabies.vitoriaAPI.Model.Contato;
import br.com.vigabies.vitoriaAPI.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("contatos")
public class ContatoResource {

    @Autowired
    private ContatoRepository contatoRepository;

    @GetMapping("/todos")
    public List<Contato> ListarTodosContatos(){
        return contatoRepository.findAll();
    }
}
