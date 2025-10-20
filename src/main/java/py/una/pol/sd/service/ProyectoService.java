package py.una.pol.sd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import py.una.pol.sd.model.Proyecto;
import py.una.pol.sd.repository.ProyectoRepository;

import java.util.List;

@Service
public class ProyectoService {

    @Autowired
    private ProyectoRepository proyectoRepository;

    public List<Proyecto> getAllProyectos() {
        return proyectoRepository.findAll();
    }

    public Proyecto getProyectoById(Long id) {
        return proyectoRepository.findById(id).orElse(null);
    }

    public Proyecto createProyecto(Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }

    public Proyecto updateProyecto(Long id, Proyecto proyecto) {
        proyecto.setIdProyecto(id);
        return proyectoRepository.save(proyecto);
    }

    public void deleteProyecto(Long id) {
        proyectoRepository.deleteById(id);
    }
}
