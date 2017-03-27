package gestionpacientes;
import java.util.*;

public class PruebaPacientes {

    public static void main(String[] args) {
        System.out.println("SISTEMA DE GESTION DE PACIENTES:");        
        Archivador archivador = new Archivador();
        
        Paciente alejo = new Paciente("Alejandro", "Hurtado Mijango", Archivador.ObtenerFecha(1991, Calendar.SEPTEMBER, 10), 1);
        alejo.setFechaUltimaConsulta(Archivador.ObtenerFecha(2017,Calendar.MARCH,20));
        alejo.setFechaSiguienteConsulta(Archivador.ObtenerFecha(2017, Calendar.APRIL, 20));
        archivador.AgregarPaciente(alejo);
        
        archivador.AgregarPaciente(new Paciente("Susanna", "Perez Montenegro", Archivador.ObtenerFecha(1993, Calendar.FEBRUARY, 18), 2));
        archivador.AgregarPaciente(new Paciente("Irene", "Catalan", Archivador.ObtenerFecha(1992, Calendar.OCTOBER, 20), 3));
        
        archivador.ObtenerCantidadDePacientes();
        archivador.ListarPacientes();
        System.out.println();
        archivador.MostrarInformacionPaciente(2);
        System.out.println();
        archivador.ListarPacientesParaDiaEnEspecifico(Archivador.ObtenerFecha(2017, Calendar.APRIL, 20));
        System.out.println();
        archivador.ListarPacientesPorEdad();
    }
}
