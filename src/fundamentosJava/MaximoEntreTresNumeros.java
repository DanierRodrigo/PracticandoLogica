package fundamentosJava;

import java.util.Scanner;

public class MaximoEntreTresNumeros {

    //Escribe un programa que pida tres números y muestre cuál es el mayor.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int num1 = scanner.nextInt();

        System.out.println("Introduzca un segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Introduzca un tercer número: ");
        int num3 = scanner.nextInt();

        int numMayor;

        if(num1 > num2){
            numMayor = num1;
        }else{
            numMayor = num2;
        }

        if(numMayor < num3){
            numMayor = num3;
        }

        System.out.println("De los números: " + num1 + " , " + num2 + " y " + num3 + " el mayor es " + numMayor);

    }
}
