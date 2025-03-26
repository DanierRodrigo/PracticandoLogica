package fundamentosJava.strings;

import java.util.Random;
import java.util.Scanner;

public class GeneradorAlias {

    //Crea un programa que genere un alias a partir del nombre de una persona.
    public static void main(String[] args) {

        //Llamamos a la clase Scanner
        Scanner scanner = new Scanner(System.in);

        // Pedimos el nombre al usuario
        System.out.print("Ingrese nombre y apellido: ");
        String nombreCompleto = scanner.nextLine();

        // Validar que la entrada no esté vacía y no contenga números
        if (nombreCompleto.isEmpty()) {
            System.out.println("El campo no puede estar vacío.");
            return; // Terminamos el programa si está vacío
        }

        // Comprobamos que la entrada no contiene números
        if (nombreCompleto.matches(".*\\d.*")) {
            System.out.println("El nombre no puede contener números.");
            return; // Terminamos el programa si contiene números
        }

        // Separamos el nombre y el apellido
        String[] partes = nombreCompleto.split(" ");
        if (partes.length < 2) {
            System.out.println("Por favor ingrese al menos un nombre y un apellido.");
            return; // Terminamos el programa si no se ingresan al menos dos palabras
        }

        String nombre = partes[0];
        String apellido = partes[1];

        // Generamos dos números aleatorios
        Random random = new Random();
        int numero1 = random.nextInt(10); // Número entre 0 y 9
        int numero2 = random.nextInt(10); // Número entre 0 y 9

        // Tomamos las primeras dos letras del apellido
        String apellidoCorto = apellido.length() >= 2 ? apellido.substring(0, 2) : apellido;

        // Generamos el alias: nombre + las dos primeras letras del apellido + los dos números
        String alias = nombre + apellidoCorto + numero1 + numero2;

        // Mostramos el alias generado
        System.out.println("Tu alias es: " + alias);

        // Cerramos el scanner
        scanner.close();
    }
}
