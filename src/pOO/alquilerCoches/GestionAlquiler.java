package pOO.alquilerCoches;

import java.util.List;

//Representa la gestión de coches y alquileres
public class GestionAlquiler {

    //Atributos
    private List<Coche> coches;
    private List<Alquiler> alquileres;

    //Constructor
    public GestionAlquiler(List<Alquiler> alquileres, List<Coche> coches) {
        this.alquileres = alquileres;
        this.coches = coches;
    }
}
