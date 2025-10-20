package py.una.pol.sd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.una.pol.sd.model.Cliente;
import py.una.pol.sd.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    // Obtener todos los clientes
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    // Crear un nuevo cliente
    public Cliente crear(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
