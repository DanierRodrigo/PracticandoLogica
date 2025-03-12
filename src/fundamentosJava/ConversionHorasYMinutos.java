package fundamentosJava;

import java.util.Scanner;

public class ConversionHorasYMinutos {

    //Pide una cantidad de minutos e imprime cuántas horas y minutos representa.
    public static void main(String[] args) {

        //Llamamos a la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Pedimos los minutos al usuario y guardamos el valor en su variable
        System.out.println("Introduzca la cantidad de minutos: ");
        int minutos = scanner.nextInt();

        //Iniciamos la variable horas
        int horas;

        //Realizamos la conversión de minutos a horas
        if(minutos % 60 == 0){
            horas = minutos / 60;
            System.out.println(minutos + " minutos corresponden a " + horas + " horas");
        }else{
            horas = minutos / 60;
            int resto = minutos % 60;  //Creo esta variable local para los minutos sobrantes
            System.out.println(minutos + " minutos corresponden a " + horas + " horas y " + resto + " minutos");
        }
    }
}
