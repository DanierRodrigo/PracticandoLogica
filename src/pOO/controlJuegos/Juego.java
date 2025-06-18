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

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getDesarrolladora() {
        return desarrolladora;
    }

    public void setDesarrolladora(String desarrolladora) {
        this.desarrolladora = desarrolladora;
    }

    //toString
    @Override
    public String toString() {
        return nombre + " (" + plataforma + ", " + anioCreacion + ") - " + desarrolladora;
    }
}
