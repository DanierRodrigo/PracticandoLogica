package fundamentosJava;

import java.util.Scanner;

public class ConcatenacionNombre {

    //Pide al usuario su nombre y apellido y muestra un mensaje de bienvenida.
    public static void main(String[] args) {

        //Llamamos a la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Pedimos los datos al usuario y lo guardamos en sus variables
        System.out.print("Introduzca su nombre: ");
        String nombre = scanner.next();

        System.out.print("Introduzca su primer apellido: ");
        String apellido = scanner.next();

        System.out.print("Introduzca su segundo apellido: ");
        String apellido2 = scanner.next();

        //Mostramos los datos por pantalla
        System.out.println("¡Hola " + nombre + " " + apellido + " " + apellido2 + " ,un gusto su visita!" );
    }
}
