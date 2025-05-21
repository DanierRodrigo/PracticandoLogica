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
}
