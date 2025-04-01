package estructurasDeControl;

import java.util.Scanner;

public class verificadorEdad {

    //Crea un programa que verifique si una persona es mayor de edad.
    //La persona debe ingresar su edad, y el programa debe imprimir si es mayor de edad (18 años o más) o menor de edad.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Verificar si es mayor de edad
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
}
