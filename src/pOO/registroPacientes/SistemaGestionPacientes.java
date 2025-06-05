package pOO.registroPacientes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaGestionPacientes {
    public static void main(String[] args) {

        // Crear doctores
        Doctor drRodrigo = new Doctor("Dr. Rodrigo", "Traumatología");
        Doctor draBucas = new Doctor("Dra. Bucas", "Pediatría");
        Doctor drCalero = new Doctor("Dr. Calero", "Fisioterapia");

        // Crear pacientes
        Paciente juan = new Paciente("Juan Pérez", 45);
        Paciente maria = new Paciente("María López", 12);
        Paciente miguel = new Paciente("Miguel Manzano", 22);

        // Registrar consultas
        List<Consulta> consultas = new ArrayList<>();
        consultas.add(new Consulta(juan, drRodrigo, LocalDate.of(2025, 5, 20), "Traumatismo craneoencefálico"));
        consultas.add(new Consulta(maria, draBucas, LocalDate.of(2025, 5, 19), "Gripe"));
        consultas.add(new Consulta(maria, drCalero, LocalDate.of(2025, 5, 19), "Rehabilitación de hombro"));
    }
}
