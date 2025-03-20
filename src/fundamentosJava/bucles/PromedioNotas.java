package fundamentosJava.bucles;

import java.util.Scanner;

public class PromedioNotas {
    //Ingresa número de asignaturas, nombre y nota de éstas y calcula el promedio
    public static void main(String[] args) {

        //Llamamos a la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Preguntamos al usuario, validamos y guardamos la variable
        System.out.print("¿Cuántas asignaturas tienes?: ");

        if(!scanner.hasNextInt()){
            System.out.println("Introduzca una cantidad válida. \nReinicie el programa");
            scanner.close();
            return;
        }

        int numAsignaturas = scanner.nextInt();
        scanner.nextLine();

        //Iniciamos variable para acumular notas en el bucle
        double sumatorioNotas = 0;

        //Bucle para preguntar nombre de asignatura y sus notas
        for (int i = 1; i <= numAsignaturas; i++) {
            System.out.print("Escriba el nombre de la #" + i + " asignatura: ");
            String asignatura = scanner.nextLine();  //NextLine guarda la línea completa, no solo la primera palabra

            System.out.print("¿Cúal es tu calificación en " + asignatura + "?: ");

            if(!scanner.hasNextDouble()){
                System.out.print("Introduzca una calificación válida. \nReinicie el programa");
                scanner.close();
                return;
            }

            double notas = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea

            //Acumulamos las notas
            sumatorioNotas += notas;

        }
        //Calculamos y mostramos el promedio por pantalla
        double promedioNotas = sumatorioNotas/numAsignaturas;
        System.out.print("\nLa calificación media de las anteriores " + numAsignaturas + " asignaturas es " + promedioNotas);

        //Cerramos Scanner
        scanner.close();

        //Vamos a usar un condicional para mostrar por pantalla la calificación media
        String calificacion = obtenerCalificacion(promedioNotas);

        System.out.println("\n" + calificacion + "\nGracias por utilizar este programa");
    }

    //Creamos una función para añadir un mensaje extra dependiendo del promedio obtenido
    private static String obtenerCalificacion(double promedioNotas) {
        String calificacion;
        if (promedioNotas >= 9.00 && promedioNotas <= 10.00) {
            calificacion = "Excelente";
        } else if (promedioNotas >= 7.00 && promedioNotas < 9.00) {
            calificacion = "Muy bien";
        } else if (promedioNotas >= 6.00 && promedioNotas < 7.00) {
            calificacion = "Bien";
        } else if (promedioNotas >= 5.00 && promedioNotas < 6.00) {
            calificacion = "Suficiente";
        } else {
            calificacion = "Insuficiente";
        }
        return calificacion;
    }
}
