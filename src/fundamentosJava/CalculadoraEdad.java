package fundamentosJava;

import java.time.Year;
import java.util.Scanner;

public class CalculadoraEdad {

    //Pide al usuario que ingrese su año de nacimiento y muestra su edad actual.
    public static void main(String[] args) {

        //Llamamos a la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Pedimos al usuario su año de nacimiento
        System.out.println("Introduzca su año de nacimiento: ");
        int nac = scanner.nextInt();

        //Metemos en una variable el resultado de llamar a la función de la clase Year para obtener el año
        int year = Year.now().getValue();

        //Hacemos la resta para averiguar la edad del usuario
        int edad = year - nac;

        //Mostramos por pantalla los datos y la edad del usuario
        System.out.println("Si usted nació en el año " + nac + " ,tiene la edad de " + edad + " años");

    }
}
