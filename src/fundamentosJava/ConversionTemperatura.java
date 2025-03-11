package fundamentosJava;

import java.util.Scanner;

public class ConversionTemperatura {

    //Pide una temperatura en grados Celsius y conviértela a Fahrenheit. Fórmula: F=(C×9/5)+32
    public static void main(String[] args) {

        //Llamamos a la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Pedimos los grados al usuario y almacenamos el valor en una variable
        System.out.print("Introduzca el valor en grados Celcius: ");
        int celcius = scanner.nextInt();

        //Hacemos el cálculo y lo guardamos en una nueva variable
        int fahrenheit = (celcius * 9) / 5 + 32;

        //Mostramos los datos por pantalla
        System.out.println(celcius + " grados Celcius equivalen a " + fahrenheit + " grados Fahrenheit");
    }
}
