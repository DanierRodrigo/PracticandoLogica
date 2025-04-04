package estructurasDeControl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class clavePin {

    //Crea un programa que solicite al usuario un PIN de 4 dígitos. Si el PIN es correcto, muestra "Acceso concedido".
    // De lo contrario, muestra "PIN incorrecto, intente de nuevo". Permite 3 intentos antes de bloquear el acceso.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int PIN_CORRECTO = 1234;
        int intentos = 3;
        int pinIngresado = 0;

        System.out.println("🔒 Bienvenido al cajero automático");

        while (intentos > 0) {
            try {
                System.out.print("Ingrese su PIN: ");
                pinIngresado = scanner.nextInt(); // Captura el PIN

                if (pinIngresado == PIN_CORRECTO) {
                    System.out.println("✅ Acceso concedido. Bienvenido a su cuenta.");
                    return;
                } else {
                    intentos--;
                    if (intentos > 0) {
                        System.out.println("❌ PIN incorrecto. Intentos restantes: " + intentos);
                    } else {
                        System.out.println("🚫 Cuenta bloqueada. Demasiados intentos fallidos.");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("⚠ Error: Debe ingresar solo números.");
                scanner.next(); // Limpiar entrada incorrecta
            }
        }

        scanner.close();
    }
}
