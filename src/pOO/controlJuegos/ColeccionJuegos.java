package pOO.controlJuegos;

import java.util.ArrayList;
import java.util.List;

public class ColeccionJuegos {

    //Atributos
    private List<Juego> juegos;

    //Métodos
    public ColeccionJuegos() {
        this.juegos = new ArrayList<>();
    }

    public void agregarJuego(Juego juego) {
        juegos.add(juego);
        System.out.println("Juego agregado: " + juego.getNombre());
    }

    public void eliminarJuego(String nombre) {
        juegos.removeIf(j -> j.getNombre().equalsIgnoreCase(nombre));
        System.out.println("Juego eliminado: " + nombre);
    }

    public void listarJuegos() {
        if (juegos.isEmpty()) {
            System.out.println("No hay juegos en la colección.");
        } else {
            for (Juego juego : juegos) {
                System.out.println(juego);
            }
        }
    }
}
