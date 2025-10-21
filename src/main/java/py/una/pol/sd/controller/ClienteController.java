package py.una.pol.sd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import py.una.pol.sd.model.Cliente;
import py.una.pol.sd.repository.ClienteRepository;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    // Obtener todos los clientes
    @GetMapping(value = ("/listar"), produces = {org.springframework.http.MediaType.APPLICATION_JSON_VALUE, org.springframework.http.MediaType.APPLICATION_XML_VALUE})
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    // Obtener cliente por ID
    @GetMapping("/{id}")
    public Cliente getClienteById(@PathVariable Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    // Crear nuevo cliente
    @PostMapping(value = "/crear", consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public Cliente createCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Actualizar cliente
    @PutMapping("/{id}")
    public Cliente updateCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        cliente.setIdCliente(id);
        return clienteRepository.save(cliente);
    }

    // Eliminar cliente
    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id) {
        clienteRepository.deleteById(id);
    }
}
