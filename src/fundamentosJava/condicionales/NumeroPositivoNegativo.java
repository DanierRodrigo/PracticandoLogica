package fundamentosJava.condicionales;

import java.util.Scanner;

public class NumeroPositivoNegativo {

    //Pide un número e indica si es positivo, negativo o cero.
    public static void main(String[] args) {

        //Llamamos a la clase Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca un número: ");

        // Validamos que la entrada sea un número entero
        if (scanner.hasNextInt()) {      //hasNextInt() verifica si la entrada es un número entero antes de intentar leerlo.
            int numero = scanner.nextInt();    //Si la entrada es válida lo almacena

            // Verificamos si el número es positivo, negativo o cero
            if (numero > 0) {
                System.out.println("El número " + numero + " es positivo.");
            } else if (numero < 0) {
                System.out.println("El número " + numero + " es negativo.");
            } else {
                System.out.println("El número es cero.");
            }
        } else {   //Si la entrada de datos no es válida, muestra el error
            System.out.println("Error: Debe ingresar un número entero.");
        }
        //Cerramos el Scanner después de usarlo
        scanner.close();
    }
}
