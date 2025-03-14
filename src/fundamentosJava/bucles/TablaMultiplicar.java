package fundamentosJava.bucles;

import java.util.Scanner;

public class TablaMultiplicar {

    //Solicita un número y muestra su tabla de multiplicar del 1 al 10 usando un bucle for
    public static void main(String[] args) {

        //Llamamos a la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Solicitamos un número al usuario
        System.out.print("Tabla de multiplicar, introduzca un número: ");

        // Verificamos que la entrada sea un número entero antes de guardar la variable
        if (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número válido.");
            scanner.close();
            return;
        }

        int num = scanner.nextInt();

        //Hacemos un bucle for para crear la tabla de multiplicar
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " por " + i + " = " + num * i);
        }

        //Cerramos el Scanner
        scanner.close();
    }
}
