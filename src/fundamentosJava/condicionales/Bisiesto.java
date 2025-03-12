package fundamentosJava.condicionales;

import java.util.Scanner;

public class Bisiesto {

    //Pide un año e indica si es bisiesto. Un año es bisiesto si:
    //Es divisible por 4.
    //No es divisible por 100, a menos que también sea divisible por 400.

    public static void main(String[] args) {

        //Llamamos a la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Pedimos el dato al usuario
        System.out.print("Introduzca el año que quiera comprobar: ");

        //Validamos que la entrada sea un número entero
        if (scanner.hasNextInt()) {      //hasNextInt() verifica si la entrada es un número entero antes de intentar leerlo.
            int year = scanner.nextInt();    //Si la entrada es válida lo almacena

            //Aplicamos la lógica para averiguar si el año es bisiesto
            if (year % 4 == 0 || year % 100 == 0 && year % 400 == 0) {
                System.out.println("El año " + year + " es bisiesto.");
            } else {
                System.out.println("El año " + year + " no es bisiesto.");
            }
        } else {   //Si la entrada de datos no es válida, muestra el error
            System.out.println("Error: Debe ingresar un número entero.");
        }
        //Cerramos el Scanner después de usarlo
        scanner.close();
    }
}

