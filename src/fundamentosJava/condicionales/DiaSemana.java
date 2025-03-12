package fundamentosJava.condicionales;

import java.util.Scanner;

public class DiaSemana {

    //Pide un número del 1 al 7 e imprime el día de la semana correspondiente
    public static void main(String[] args) {

        //Llamamos a la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Pedimos el dato al usuario y lo almacenamos en una variable
        System.out.print("Indica el número del día de la semana (del 1 al 7): ");

        // Verificamos que la entrada sea un número entero
        if (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número válido.");
            scanner.close();
            return;
        }

        int diaSemana = scanner.nextInt();

        // Validamos que esté dentro del rango permitido
        if (diaSemana < 1 || diaSemana > 7) {
            System.out.println("Error: Debe ingresar un número del 1 al 7.");
            scanner.close();
            return;
        }

        // Usamos switch para determinar el día de la semana, nueva manera
        String dia = switch (diaSemana) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Desconocido"; // Nunca se ejecutará porque ya validamos antes
        };

        // Mostramos el resultado
        System.out.println("El día correspondiente es: " + dia);

        scanner.close();
    }

}
