package pOO.alquilerCoches;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Crear lista de coches y alquileres
        List<Coche> listaCoches = new ArrayList<>();
        List<Alquiler> listaAlquileres = new ArrayList<>();

        // Crear instancia de gestión
        GestionAlquiler gestion = new GestionAlquiler(listaAlquileres, listaCoches);

        //Agregamos coches
        gestion.agregarCoche(new Coche("Toyota", "Corolla", 2020, true));
        gestion.agregarCoche(new Coche("Honda", "Civic", 2019, true));
        gestion.agregarCoche(new Coche("Ford", "Fiesta", 2022, true));
        gestion.agregarCoche(new Coche("Porche", "Carrera GT", 2005, true));

        //Creamos cliente
        Cliente cliente1 = new Cliente("Daniel Rodrigo", "28826162", "638254112");

        //Mostrar coches disponibles
        gestion.mostrarCochesDisponibles();





    }
}
