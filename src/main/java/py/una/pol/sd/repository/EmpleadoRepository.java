package py.una.pol.sd.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import py.una.pol.sd.model.Empleado;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, Long> {

    // Listar todos los empleados
    List<Empleado> findAll();

    // Buscar empleados por nombre
    List<Empleado> findByNombre(String nombre);

    // Buscar empleados por apellido
    List<Empleado> findByApellido(String apellido);

    // Buscar empleados por rol
    List<Empleado> findByRol(String rol);

    // Buscar empleado por email
    Empleado findByEmail(String email);
}
