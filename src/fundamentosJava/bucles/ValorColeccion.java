package fundamentosJava.bucles;

import java.util.Scanner;

public class ValorColeccion {

    //Pide la cantidad de juegos, su nombre y acumula sus precios para obtener el valor de la colección
    public static void main(String[] args) {

        // Llamamos a la clase Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos juegos tiene tu colección?: ");

        // Validamos que se introduce una cantidad correcta
        if (!scanner.hasNextInt()) {
            System.out.println("Introduzca una cantidad válida. \nReinicie el programa.");
            scanner.close();
            return;
        }

        int numJuegos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Variables acumuladoras
        double totalInversion = 0;
        double totalValor = 0;

        // Bucle para pedir los datos de cada juego
        for (int i = 1; i <= numJuegos; i++) {
            System.out.print("Escriba el nombre del #" + i + " juego: ");
            String nombreJuego = scanner.nextLine();

            System.out.print("¿Cuánto te costó " + nombreJuego + "?: ");

            // Validar que el usuario introduce un número válido
            if (!scanner.hasNextDouble()) {
                System.out.println("Debe introducir una cantidad válida. \nReinicie el programa.");
                scanner.close();
                return;
            }

            double inversionJuego = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea

            System.out.print("¿Qué valor tiene ahora " + nombreJuego + " en el mercado?: ");

            // Validar que el usuario introduce un número válido
            if (!scanner.hasNextDouble()) {
                System.out.println("Debe introducir una cantidad válida. \nReinicie el programa.");
                scanner.close();
                return;
            }

            double valorJuego = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea

            // Acumulamos la inversión y el valor total de los juegos
            totalInversion += inversionJuego;
            totalValor += valorJuego;
        }

        // Mostrar resultados
        System.out.printf("\nInversión total en juegos: %.2f euros%n", totalInversion);
        System.out.printf("Valor actual de tu colección: %.2f euros%n", totalValor);

        // Cerrar Scanner
        scanner.close();
    }
}
