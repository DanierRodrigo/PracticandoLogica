package pOO.controlJuegos;

public class Juego {

    //Atributos
    private String nombre;
    private String plataforma;
    private int anioCreacion;
    private String desarrolladora;

    //Constructor
    public Juego(String nombre, String plataforma, int anioCreacion, String desarrolladora) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.anioCreacion = anioCreacion;
        this.desarrolladora = desarrolladora;
    }
}
