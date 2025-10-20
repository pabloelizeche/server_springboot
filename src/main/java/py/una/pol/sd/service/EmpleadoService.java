package py.una.pol.sd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.una.pol.sd.model.Empleado;
import py.una.pol.sd.repository.EmpleadoRepository;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    // Obtener todos los empleados
    public List<Empleado> getAllEmpleados() {
        return empleadoRepository.findAll();
    }

    // Crear un nuevo empleado
    public Empleado crear(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }
}
