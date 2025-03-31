package estructurasDeControl;

import java.util.Scanner;

public class cajeroAutomatico {

    //Crea un programa que simule un cajero automático
    //Permitiendo realizar las siguientes acciones: ingresar saldo, retirar dinero, consultar saldo y salir.
    public static void main(String[] args) {

        //Llamamos a la clase Scanner e inicializamos las variables
        Scanner scanner = new Scanner(System.in);
        double saldo;
        int opcion;

        //Pedimos la cantidad al usuario y actualizamos la variable
        System.out.print("Ingrese su saldo inicial: ");
        saldo = scanner.nextDouble();

        //Creamos un bucle do-while para ejecutar el menú y actualizar la respuesta en la variable
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("\nSeleccione una opción: ");
            opcion = scanner.nextInt();

            //Condición switch según la respuesta del usuario
            switch (opcion) {
                case 1:
                    System.out.print("\nSaldo actual: " + saldo);
                    break;
                case 2:
                    System.out.print("\n¿Cuánto desea ingresar? ");
                    //Validamos que la entrada sea numérica
                    if(scanner.hasNextDouble()){
                        double ingreso = scanner.nextDouble();
                        saldo += ingreso;
                        System.out.println("\nIngreso exitoso. Saldo restante: " + saldo);
                    }else {
                        System.out.println("\nCantidad introducida no válida, debe ser un número.");
                        scanner.next();  // Consumir el valor no válido
                    }
                    break;
                case 3:
                    System.out.print("\n¿Cuánto desea retirar? ");
                    // Validamos que la entrada sea numérica
                    if(scanner.hasNextDouble()) {
                        double retiro = scanner.nextDouble();
                        if (retiro <= saldo) {
                            saldo -= retiro;
                            System.out.println("\nRetiro exitoso. Saldo restante: " + saldo);
                        } else {
                            System.out.println("\nSaldo insuficiente.");
                        }
                    } else {
                        System.out.println("\nCantidad introducida no válida, debe ser un número.");
                        scanner.next();  // Consumir el valor no válido
                    }
                    break;
                case 4:
                    System.out.println("\nGracias por usar el cajero.");
                    break;
                default:
                    System.out.println("\nOpción no válida.");
                    break;
            }
        } while (opcion != 4);

        // Cerramos el scanner al final del programa
        scanner.close();
    }
}
