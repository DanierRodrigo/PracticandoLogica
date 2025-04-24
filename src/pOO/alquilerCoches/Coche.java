package pOO.alquilerCoches;

//Representa un coche alquilable
public class Coche {

    //Atributos
    private String marca;
    private String modelo;
    private int año;
    private boolean disponible;

    //Constructor
    public Coche(String marca, String modelo, int año, boolean disponible) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.disponible = true; // Por defecto, disponible
    }
}
