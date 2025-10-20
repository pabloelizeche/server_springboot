package py.una.pol.sd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpleado;

    private String nombre;
    private String apellido;
    private String rol;
    private String email;

    protected Empleado() {}

    public Empleado(String nombre, String apellido, String rol, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.email = email;
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getRol() {
        return rol;
    }

    public String getEmail() {
        return email;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
