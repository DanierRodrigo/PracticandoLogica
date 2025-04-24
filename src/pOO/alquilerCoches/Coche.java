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

    // Getters y Setters
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAño() { return año; }
    public boolean isDisponible() { return disponible; }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
