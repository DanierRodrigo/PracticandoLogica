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
    }
}
