package pOO.alquilerCoches;

//Representa a un cliente que alquila un coche
public class Cliente {

    //Atributos
    private String nombre;
    private String documento;
    private String telefono;

    //Constructor
    public Cliente(String nombre, String documento, String telefono) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
    }

    //Getter
    public String getNombre() {
        return nombre;
    }

    //Métodos
    @Override
    public String toString() {
        return nombre + " - Doc: " + documento;
    }
}
