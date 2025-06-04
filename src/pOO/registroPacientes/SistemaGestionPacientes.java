package pOO.registroPacientes;

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
    }
}
