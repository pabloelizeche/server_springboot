package py.una.pol.sd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import py.una.pol.sd.model.Empleado;
import py.una.pol.sd.service.EmpleadoService;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/saludo")
    public String index() {
        return "Hola mundo caluroso de Springboot - Empleados";
    }

    @GetMapping(value = "/listar", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<List<Empleado>> getEmpleados() {
        List<Empleado> lista = empleadoService.getAllEmpleados();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @PostMapping(value = "/crear", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> create(@RequestBody Empleado emp) {
        if(emp != null && emp.getNombre() != null) {
            empleadoService.crear(emp);
            return new ResponseEntity<>("Se recepcionó correctamente el empleado: " + emp.toString(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Debe enviar al menos el nombre del empleado.", HttpStatus.BAD_REQUEST);
        }
    }
}
