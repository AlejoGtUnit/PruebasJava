package gestionpacientes;
import java.util.*;

public class Persona 
{
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private Date fechaCreacion;

    public Persona(String nombres, String apellidos, Date fechaNacimiento){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaCreacion = new Date();
    }
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

//    public int getEdad() {
//        return (new Date() - this.fechaNacimiento);
//    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Nombre completo: " + this.getNombres() + " " + this.getApellidos() + ", Fecha nacimiento: " + Archivador.formateador.format(fechaNacimiento);
    }
}
