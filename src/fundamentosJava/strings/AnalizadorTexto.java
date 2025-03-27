package fundamentosJava.strings;

import java.util.Scanner;

public class AnalizadorTexto {

    //Pide al usuario un párrafo y muestra: Número de palabras, cantidad de vocales, palabra más larga y más corta.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un párrafo
        System.out.print("Ingrese un párrafo:");
        String texto = scanner.nextLine();

        // Separar palabras
        String[] palabras = texto.split("\\s+"); // \\s significa cualquier espacio en blanco, y + uno o más espacios, es mucho mejor que " "
        int numPalabras = palabras.length;

        // Contar vocales
        int numVocales = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if ("aeiouáéíóú".indexOf(c) != -1) {  //index 0 sería la primera letra de la palabra
                numVocales++;
            }
        }

        // Encontrar la palabra más larga y la más corta
        String palabraMasLarga = "", palabraMasCorta = palabras[0];
        for (String palabra : palabras) {
            String palabraLimpia = palabra.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚ]", ""); // Eliminar signos de puntuación
            if (palabraLimpia.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabraLimpia;
            }
            if (palabraLimpia.length() < palabraMasCorta.length()) {
                palabraMasCorta = palabraLimpia;
            }
        }

        // Mostrar resultados
        System.out.println("Número de palabras: " + numPalabras);
        System.out.println("Cantidad de vocales: " + numVocales);
        System.out.println("Palabra más larga: " + palabraMasLarga);
        System.out.println("Palabra más corta: " + palabraMasCorta);

        scanner.close();
    }
}
