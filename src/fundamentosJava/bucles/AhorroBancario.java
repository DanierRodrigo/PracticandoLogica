package fundamentosJava.bucles;

import java.util.Scanner;

public class AhorroBancario {

    //Pide al usuario cuánto quiere ahorrar cada mes.
    //Pregunta cuántos meses quiere ahorrar.
    //Calcula el total ahorrado mes a mes e incluye un interés del 2% mensual acumulativo.
    public static void main(String[] args) {

        //Llamamos a la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Preguntamos al usuario la cantidad a ahorrar
        System.out.print("¿Cuánto desea destinar a ahorro cada mes?: ");

        //Validamos que lo introducido por el usuario sea válido
        if(!scanner.hasNextDouble()){
            System.out.println("Debe introducir una cantidad válida. Reinicie el programa");
            scanner.close();
            return;
        }

        //Si el dato es correcto, lo almacenamos en una variable
        double ahorroMensual = scanner.nextDouble();

        //Realizamos lo mismo para conocer la cantidad de meses
        System.out.print("¿Por cuántos meses realizará el ahorro?: ");

        if(!scanner.hasNextInt()){
            System.out.println("Debe introducir una cantidad válida. Reinicie el programa");
            scanner.close();
            return;
        }

        int meses = scanner.nextInt();

        //Creamos otras dos variables para el total ahorrado y el interés mensual
        double totalAhorrado = 0;
        double interesMensual = 0.02; // 2% de interés mensual

        // Calcular el ahorro mes a mes, en lugar de usar i usamos mes
        for (int mes = 1; mes <= meses; mes++) {
            totalAhorrado += ahorroMensual;  // Agregar el ahorro del mes
            totalAhorrado += totalAhorrado * interesMensual;  // Aplicar interés

            // Mostrar el progreso
            System.out.printf("Mes %d: Total ahorrado con interés: %.2f%n", mes, totalAhorrado);
        }

        // Mostrar resultado final
        System.out.printf("\nTotal ahorrado después de %d meses: %.2f%n", meses, totalAhorrado);
        System.out.println("Sin interés hubiese ahorrado :" + ahorroMensual * meses);
        //Cerramos Scanner
        scanner.close();
    }
}
