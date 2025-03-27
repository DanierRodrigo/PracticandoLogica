package fundamentosJava.strings;

import java.util.Scanner;

public class CensorPalabras {

    //Implementa un sistema que reemplace ciertas palabras censuradas por ****.
    public static void main(String[] args) {

        // Lista de palabras censuradas
        String[] palabrasCensuradas = {"malo", "feo", "basura", "payaso", "palangana"};

        // Pedimos al usuario que ingrese un texto
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String texto = scanner.nextLine();

        // Separamos el texto en palabras individuales
        String[] palabras = texto.split(" ");

        // Recorremos cada palabra en el texto
        for (int i = 0; i < palabras.length; i++) {
            // Limpiamos la puntuación al principio y al final de la palabra
            String palabraLimpia = palabras[i].replaceAll("^[^a-zA-Z]+|[^a-zA-Z]+$", "");

            // Comparamos la palabra limpia con las palabras censuradas
            for (String censura : palabrasCensuradas) {
                if (palabraLimpia.equalsIgnoreCase(censura)) { // Usamos equalsIgnoreCase para ignorar mayúsculas/minúsculas
                    palabras[i] = "****"; // Reemplazamos la palabra censurada con "****"
                    break; // Si encontramos una coincidencia, salimos del bucle
                }
            }
        }

        // Reconstruimos el texto con las palabras reemplazadas
        String textoCensurado = String.join(" ", palabras);

        // Mostramos el texto censurado
        System.out.println("Texto censurado: " + textoCensurado);

        scanner.close();
    }
}
