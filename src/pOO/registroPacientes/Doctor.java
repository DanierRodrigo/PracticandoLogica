package pOO.registroPacientes;

public class Doctor {

    //Atributos
    private String nombre;
    private String especialidad;

    //Constructor
    public Doctor(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    //Métodos
    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}

