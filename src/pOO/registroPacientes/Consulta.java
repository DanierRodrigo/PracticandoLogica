package pOO.registroPacientes;

import java.time.LocalDate;

public class Consulta {

    //Atributos
    private Paciente paciente;
    private Doctor doctor;
    private LocalDate fecha;
    private String diagnostico;

    //Constructor
    public Consulta(Paciente paciente, Doctor doctor, LocalDate fecha, String diagnostico) {
        this.paciente = paciente;
        this.doctor = doctor;
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        paciente.agregarHistorial("Consulta: " + fecha + ", Dr. " + doctor.getNombre() + ", Diagnóstico: " + diagnostico);
    }

    //Métodos
    public Paciente getPaciente() {
        return paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "paciente=" + paciente +
                ", doctor=" + doctor +
                ", fecha=" + fecha +
                ", diagnostico='" + diagnostico + '\'' +
                '}';
    }
}
