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
}
