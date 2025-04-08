package arreglosYcadenas;

import java.util.Arrays;
import java.util.Scanner;

public class ordenarArray {

    //Escribe un programa que ordene un array de números ingresados por el usuario
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidad = 0;

        // Validar entrada de cantidad
        System.out.print("¿Cuántos números quieres ingresar? ");
        if (scanner.hasNextInt()) {
            cantidad = scanner.nextInt();
            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser mayor que 0.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Por favor, introduce una cantidad válida.");
            scanner.close();
            return;
        }

        // Crear el array vacío
        int[] numeros = new int[cantidad];

        // Ingresar los números con validación
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el número #" + (i + 1) + ": ");

            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Introduce un número entero:");
                scanner.next(); // Descartar la entrada inválida
            }

            numeros[i] = scanner.nextInt();
        }

        // Ordenar el array
        Arrays.sort(numeros);

        // Mostrar el resultado
        System.out.println("Números ordenados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
