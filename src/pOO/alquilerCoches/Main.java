package pOO.alquilerCoches;

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



    }
}
