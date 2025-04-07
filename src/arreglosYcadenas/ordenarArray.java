package arreglosYcadenas;

import java.util.Arrays;
import java.util.Scanner;

public class ordenarArray {

    //Escribe un programa que ordene un array de números ingresados por el usuario
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir cantidad de elementos
        System.out.print("¿Cuántos números quieres ingresar? ");
        int cantidad = scanner.nextInt();

        //Creamos el array vacío
        int[] numeros = new int[cantidad];

        // Ingresar los números en el array
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Ordenar el array
        Arrays.sort(numeros);

        // Mostrar el resultado
        System.out.println("Números ordenados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
