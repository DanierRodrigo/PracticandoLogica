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

    //Métodos
    public void agregarCoche(Coche coche){
        coches.add(coche);
    }

    public void mostrarCochesDisponibles(){
        System.out.println("\\nCoches disponibles: ");
        for (Coche coche: coches){
            if(coche.isDisponible()){
                System.out.println(coche);
            }
        }
    }
}
