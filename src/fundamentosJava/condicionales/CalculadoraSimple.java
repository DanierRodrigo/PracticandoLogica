package fundamentosJava.condicionales;

import java.util.Scanner;

public class CalculadoraSimple {

    //Pide dos números y una operación (+, -, *, /) y realiza la operación usando switch-case.
    public static void main(String[] args) {

        //Llamamos a la clase Scanner
        Scanner scanner = new Scanner(System.in);

        // Pedimos el primer número
        System.out.print("Ingrese un número: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número entero.");
            scanner.close();
            return; // Sale del programa si la entrada no es válida
        }
        int num1 = scanner.nextInt();

        // Pedimos el segundo número
        System.out.print("Ingrese otro número: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número entero.");
            scanner.close();
            return;
        }
        int num2 = scanner.nextInt();

        // Pedimos la operación
        System.out.print("¿Qué operación (+, -, *, /) desea ejecutar?: ");
        String operacion = scanner.next();

        // Validamos la operación usando regex
        if (!operacion.matches("[+\\-*/]")) {
            System.out.println("Error: Debe ingresar un operador válido (+, -, *, /).");
            scanner.close();
            return;
        }

        // Realizamos la operación con switch-case
        int resultado = 0;
        boolean valido = true;

        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir por cero.");
                    valido = false;
                } else {
                    resultado = num1 / num2;
                }
                break;
        }

        // Mostramos el resultado si la operación es válida
        if (valido) {
            System.out.println("El resultado de " + num1 + " " + operacion + " " + num2 + " es: " + resultado);
        }

        // Cerramos el Scanner
        scanner.close();
    }
}
