package br.com.joik.crisostomoAPI.resource;

import br.com.joik.crisostomoAPI.model.Cliente;
import br.com.joik.crisostomoAPI.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteResource {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/todos")
    public List<Cliente> listarTodosClientes() {
        return clienteRepository.findAll();
    }
}
