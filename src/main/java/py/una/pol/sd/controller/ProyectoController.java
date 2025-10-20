package py.una.pol.sd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import py.una.pol.sd.model.Proyecto;
import py.una.pol.sd.repository.ProyectoRepository;

import java.util.List;

@RestController
@RequestMapping("/proyectos")
public class ProyectoController {

    @Autowired
    private ProyectoRepository proyectoRepository;

    // Listar proyectos
    @GetMapping
    public List<Proyecto> getAllProyectos() {
        return proyectoRepository.findAll();
    }

    // Buscar proyecto por ID
    @GetMapping("/{id}")
    public Proyecto getProyectoById(@PathVariable Long id) {
        return proyectoRepository.findById(id).orElse(null);
    }

    // Crear nuevo proyecto
    @PostMapping
    public Proyecto createProyecto(@RequestBody Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }

    // Actualizar proyecto
    @PutMapping("/{id}")
    public Proyecto updateProyecto(@PathVariable Long id, @RequestBody Proyecto proyecto) {
        proyecto.setIdProyecto(id);
        return proyectoRepository.save(proyecto);
    }

    // Eliminar proyecto
    @DeleteMapping("/{id}")
    public void deleteProyecto(@PathVariable Long id) {
        proyectoRepository.deleteById(id);
    }
}
