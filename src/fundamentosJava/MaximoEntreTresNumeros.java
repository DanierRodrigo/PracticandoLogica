package fundamentosJava;

import java.util.Scanner;

public class MaximoEntreTresNumeros {

    //Escribe un programa que pida tres números y muestre cuál es el mayor.
    public static void main(String[] args) {

        //Llamamos a la clase Scanner para poder guardar los datos que pediremos al usuario
        Scanner scanner = new Scanner(System.in);

        //Pedimos los datos y los guardamos en sus variables
        System.out.println("Introduzca un número: ");
        int num1 = scanner.nextInt();

        System.out.println("Introduzca un segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Introduzca un tercer número: ");
        int num3 = scanner.nextInt();

        //Inicializamos una variable vacía para almacenar el número mayor
        int numMayor;

        //Vamos a comparar el primer número con el segundo para determinar el mayor
        if(num1 > num2){
            numMayor = num1;
        }else{
            numMayor = num2;
        }

        //Ahora compararemos al mayor de los dos primeros números con el tercero
        if(numMayor < num3){
            numMayor = num3;
        }

        //Mostramos por pantalla los números introducidos y mostramos el mayor de los tres
        System.out.println("De los números: " + num1 + " , " + num2 + " y " + num3 + " el mayor es " + numMayor);

    }
}
