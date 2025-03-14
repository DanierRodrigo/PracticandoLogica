package fundamentosJava.bucles;

import java.util.Scanner;

public class TablaEdad {

    //Pide el año de nacimiento de una persona.
    //Pregunta hasta qué año quiere calcular su edad.
    //Usa un bucle para mostrar la edad en cada año hasta el elegido.
    public static void main(String[] args) {

        //Llamamos a la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Pedimos el año de nacimiento al usuario
        System.out.print("Introduzca su año de nacimiento: ");

        //Verificamos que la entrada de datos sea un número entero
        if(!scanner.hasNextInt()){
            System.out.println("Debe introducir un número válido, intente de nuevo");
            scanner.close();
            return;
        }

        //Una vez correcto, llegamos a este punto y almacenamos la variable
        int fechaNac = scanner.nextInt();

        //Repetiremos el proceso para preguntar al usuario el año final de comprobación de edad
        System.out.print("¿Hasta que año le gustaría conocer su edad?: ");

        if(!scanner.hasNextInt()){
            System.out.println("Debe introducir un número válido, intente de nuevo");
            scanner.close();
            return;
        }

        int fechaFin = scanner.nextInt();

        //Ahora creamos el bucle for para ver las edades del usuario
        for (int i = fechaNac; i <= fechaFin ; i++) {
            int edad = i - fechaNac;
            System.out.println("En el año " + i + " usted tiene " + edad + " años");
        }

        //Cerramos Scanner
        scanner.close();
    }
}
