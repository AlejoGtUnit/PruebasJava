package gestionpacientes;
import java.text.SimpleDateFormat;
import java.util.*;

public class Archivador 
{
    private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
    public static SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
    
    public Archivador(){
       
    }
    
    public void ListarPacientes(){
        System.out.println("PACIENTES:");
        for (Paciente paciente: this.pacientes){
            System.out.println("\t" + paciente.toString());
        }
    }
    
    public boolean AgregarPaciente(Paciente paciente){
        return this.pacientes.add(paciente);
    }
    
    public void MostrarInformacionPaciente(int codigoPaciente){
        for (Paciente paciente: pacientes){
            if (paciente.getCodigoPaciente() == codigoPaciente){
                System.out.println("Informacion de paciente:");
                System.out.println("\t" + paciente.toString());
                break;
            }
        }
    }
    
    public void ObtenerCantidadDePacientes(){
        System.out.println("Cantidad de pacientes:" + pacientes.size());
    }
    
    public void ListarPacientesParaDiaEnEspecifico(Date fecha)
    {
        System.out.println("Consultas programadas para el " + formateador.format(fecha));
        boolean hayPacientesCitados = false;
        for (Paciente paciente: this.pacientes)
        {
            if (paciente.getFechaSiguienteConsulta() != null){
                
                if (formateador.format(paciente.getFechaSiguienteConsulta()).equals(formateador.format(fecha))){
                    hayPacientesCitados = true;
                    System.out.println("\t" + paciente.toString());
                }
            }
        }
        if (!hayPacientesCitados)
            System.out.println("-------");
    }
    
    public static Date ObtenerFecha(int año, int mes, int dia){
        Calendar calendario = Calendar.getInstance();
        calendario.set(año, mes, dia);
        return calendario.getTime();
    }
    
    public void ListarPacientesPorEdad(){
        System.out.println("Pacientes ordenados por edad:");
        
        Collections.sort(pacientes, new Comparator<Paciente>() {
            @Override
            public int compare(Paciente o1, Paciente o2) {
                return o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
            }
        });
                
        for (Paciente paciente: this.pacientes){
            System.out.println("\t" + paciente.toString());
        }
    }
}
