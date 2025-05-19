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

        // Crear coches
        Coche coche1 = new Coche("Toyota", "Corolla", 2020, true);
        Coche coche2 = new Coche("Ford", "Focus", 2019, true);
        Coche coche3 = new Coche("Honda", "Civic", 2021, true);

        // Agregar coches al sistema
        gestion.agregarCoche(coche1);
        gestion.agregarCoche(coche2);
        gestion.agregarCoche(coche3);

        // Mostrar coches disponibles
        gestion.mostrarCochesDisponibles();

        // Crear cliente
        Cliente cliente = new Cliente("Juan Pérez", "12345678X", "600123456");

        // Fechas (por simplicidad usamos la fecha actual)
        Date hoy = new Date();
        Date fin = new Date(hoy.getTime() + 3 * 24 * 60 * 60 * 1000L); // +3 días

        // Alquilar un coche
        gestion.alquilarCoche(cliente, "Focus", hoy, fin);

        // Mostrar coches disponibles tras el alquiler
        gestion.mostrarCochesDisponibles();

        // Devolver el coche
        gestion.devolverCoche("Focus");

        // Mostrar coches disponibles tras la devolución
        gestion.mostrarCochesDisponibles();
    }
}
