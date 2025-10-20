package py.una.pol.sd.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import py.una.pol.sd.model.Proyecto;

@Repository
public interface ProyectoRepository extends CrudRepository<Proyecto, Long> {

    // Listar todos los proyectos
    List<Proyecto> findAll();

    // Buscar proyectos por nombre
    List<Proyecto> findByNombre(String nombre);

    // Buscar proyectos por cliente (por id)
    List<Proyecto> findByCliente_IdCliente(Long idCliente);

    // Buscar proyectos por fecha de inicio
    List<Proyecto> findByFechaInicio(String fechaInicio);

    // Buscar proyectos por fecha de fin
    List<Proyecto> findByFechaFin(String fechaFin);
}

