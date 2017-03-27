package gestionpacientes;
import java.text.SimpleDateFormat;
import java.util.*;

public class Paciente extends Persona 
{
    private int codigoPaciente;
    private Date fechaUltimaConsulta;
    private Date fechaSiguienteConsulta;
    private Double saldo;

    public Paciente(String nombres, String apellidos, Date fechaNacimiento, int codigoPaciente){
        super(nombres, apellidos, fechaNacimiento);
        this.codigoPaciente = codigoPaciente;
    }
    
    public int getCodigoPaciente() {
        return codigoPaciente;
    }

    public void setCodigoPaciente(int codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public Date getFechaUltimaConsulta() {
        return fechaUltimaConsulta;
    }

    public void setFechaUltimaConsulta(Date fechaUltimaConsulta) {
        this.fechaUltimaConsulta = fechaUltimaConsulta;
    }

    public Date getFechaSiguienteConsulta() {
        return fechaSiguienteConsulta;
    }

    public void setFechaSiguienteConsulta(Date fechaSiguienteConsulta) {
        this.fechaSiguienteConsulta = fechaSiguienteConsulta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String ultimaConsulta = "---";
        if (this.getFechaUltimaConsulta() != null)
            ultimaConsulta = new SimpleDateFormat("dd/MM/yyyy").format(this.getFechaUltimaConsulta());
        
        String siguienteConsulta = "---";
        if (this.getFechaSiguienteConsulta() != null)
            siguienteConsulta = new SimpleDateFormat("dd/MM/yyyy").format(this.getFechaSiguienteConsulta());
            
        return super.toString() + ", Codigo: " + this.codigoPaciente + ", Ultima consulta: " + ultimaConsulta + ", Siguiente Consulta: " + siguienteConsulta;
    }
}
