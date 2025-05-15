package pOO.alquilerCoches;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        //Iniciamos GestionAlquiler
        GestionAlquiler gestion = new GestionAlquiler();

        //Agregamos coches
        gestion.agregarCoche(new Coche("Toyota", "Corolla", 2020, true));
        gestion.agregarCoche(new Coche("Honda", "Civic", 2019, true));
        gestion.agregarCoche(new Coche("Ford", "Fiesta", 2022, true));
        gestion.agregarCoche(new Coche("Porche", "Carrera GT", 2005, true));

        //Creamos cliente
        Cliente cliente1 = new Cliente("Daniel Rodrigo", "28826162", "638254112");

        //Mostrar coches disponibles
        gestion.mostrarCochesDisponibles();

        //Alquilar coche
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date inicio = sdf.parse("24/04/2025");
        Date fin = sdf.parse("28/04/2025");

        gestion.alquilarCoche(cliente1, "Porche", 15/05/2025, 16/05/2025);



    }
}
