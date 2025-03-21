package fundamentosJava.strings;

import java.util.Scanner;

public class SeparadorNombre {

    // Constantes para los mensajes de error
    private static final String ERROR_VACIO = "Debe ingresar un nombre y apellidos válidos. Reinicie el programa.";
    private static final String ERROR_SIN_APELLIDO = "Debe ingresar al menos un apellido. Reinicie el programa.";
    private static final String ERROR_EXCESO_APELLIDOS = "Debe ingresar dos apellidos como máximo. Reinicie el programa.";

    //Se ingresa un nombre completo. Se separa en nombre(s) y apellido(s).
    //Si solo tiene un nombre, se muestra como único.
    public static void main(String[] args) {

        //Llamamos a la clase Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre y apellidos: ");

        // Leer la entrada del usuario
        String nombreCompleto = scanner.nextLine().trim();

        // Validación: verificar que el nombre no esté vacío
        if (nombreCompleto.isEmpty()) {
            System.out.println(ERROR_VACIO);
            scanner.close();
            return;  // Terminar el programa si no se ingresa un nombre válido
        }

        // Dividir el nombre completo en partes (nombre y apellidos)
        String[] partes = nombreCompleto.split("\\s+"); // Usar \\s+ para manejar múltiples espacios

        // Validar la cantidad de partes
        if (partes.length < 2) {
            System.out.println(ERROR_SIN_APELLIDO);
        } else if (partes.length > 3) {
            System.out.println(ERROR_EXCESO_APELLIDOS);
        } else {
            // Mostrar el nombre y apellidos
            String nombre = partes[0];
            String apellido1 = partes[1];
            //Operador ternario, o hay parte[2] o hay null
            String apellido2 = (partes.length == 3) ? partes[2] : null;

            System.out.println("Nombre: " + nombre);
            System.out.println("Primer apellido: " + apellido1);

            if (apellido2 != null) {
                System.out.println("Segundo apellido: " + apellido2);
            }
        }

        // Cerrar Scanner
        scanner.close();
    }
}
