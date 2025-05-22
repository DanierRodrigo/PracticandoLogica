package pOO.registroPacientes;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

    //Atributos
    private String nombre;
    private int edad;
    private List<String> historial;

    //Constructor
    public Paciente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.historial = new ArrayList<>();
    }

    //Métodos
    public void agregarHistorial(String entrada) {
        historial.add(entrada);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public List<String> getHistorial() {
        return new ArrayList<>(historial);
    }
}
