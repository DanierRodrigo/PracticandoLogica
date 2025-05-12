package pOO.alquilerCoches;

import java.util.Date;
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

    public void alquilarCoche(Cliente cliente, String modelo, Date fechaInicio, Date fechaFin){
        for (Coche coche : coches){
            if(coche.getModelo().equalsIgnoreCase(modelo) && coche.isDisponible()){
                coche.setDisponible(false);
                alquileres.add(new Alquiler(cliente, coche, fechaInicio, fechaFin));
                System.out.println("\\n✅ Coche alquilado a " + cliente.getNombre() + ": " + coche);
                return;
            }
        }
        System.out.println("\\n❌ No hay coches disponibles del modelo '" + modelo + "'");
    }

    public void devolverCoche(String modelo){
        for (Alquiler alquiler : alquileres){
            Coche coche = alquiler.getCoche();
            if (coche.getModelo().equalsIgnoreCase(modelo) && !coche.isDisponible()){
                coche.setDisponible(true);
                System.out.println("\\n🔄 Coche devuelto: " + coche);
                return;
            }
        }
        System.out.println("\\n❌ No se encontró un coche alquilado con el modelo '" + modelo + "'");
    }
}
