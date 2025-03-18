package fundamentosJava.bucles;

import java.util.Scanner;

public class GastoSuscripciones {

    //Calcula el gasto anual en suscripciones (Netflix, Spotify, gimnasio, etc.).
    public static void main(String[] args) {

        // Llamamos a la clase Scanner
        Scanner scanner = new Scanner(System.in);

        // Preguntar al usuario cuántas suscripciones tiene
        System.out.print("¿Cuántas suscripciones tienes?: ");

        // Validar que el usuario introduce un número válido
        if (!scanner.hasNextInt()) {
            System.out.println("Debe introducir una cantidad válida. Reinicie el programa.");
            scanner.close();
            return;
        }

        int numSubs = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Variable para acumular el costo total mensual
        double totalMensual = 0;

        // Bucle para pedir datos de cada suscripción
        for (int i = 1; i <= numSubs; i++) {
            System.out.print("Introduce el nombre de la suscripción -" + i + ": ");
            String nombreSub = scanner.nextLine();

            System.out.print("Introduce el costo mensual de " + nombreSub + ": ");

            // Validar que el usuario introduce un número válido
            if (!scanner.hasNextDouble()) {
                System.out.println("Debe introducir una cantidad válida. Reinicie el programa.");
                scanner.close();
                return;
            }

            double costoMensual = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea

            // Acumular el costo total mensual
            totalMensual += costoMensual;
        }

        // Calcular el gasto anual
        double totalAnual = totalMensual * 12;

        // Mostrar resultados
        System.out.printf("\nGasto mensual en suscripciones: %.2f euros%n", totalMensual);
        System.out.printf("Gasto anual en suscripciones: %.2f euros%n", totalAnual);

        // Cerrar Scanner
        scanner.close();
    }
}
