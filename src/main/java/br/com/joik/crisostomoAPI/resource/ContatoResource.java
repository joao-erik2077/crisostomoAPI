package br.com.joik.crisostomoAPI.resource;

import br.com.joik.crisostomoAPI.model.Contato;
import br.com.joik.crisostomoAPI.repository.ContatoRepository;
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
    public List<Contato> listarTodosContatos() {
        return contatoRepository.findAll();
    }
}
