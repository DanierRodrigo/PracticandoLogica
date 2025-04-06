package estructurasDeControl;

import java.util.Scanner;

public class adivinaNumero {

    //Generar un número aleatorio entre 1 y 100. Luego, el usuario debe adivinarlo.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Genera un número aleatorio entre 1 y 100
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int intento = 0;
        int intentos = 0;

        System.out.println("🎲 ¡Bienvenido al juego de adivinanza!");
        System.out.println("Intenta adivinar el número (entre 1 y 100)");

        while (intento != numeroSecreto) {
            System.out.print("Introduce tu número: ");

            // Validamos que el usuario realmente introduzca un número
            while (!scanner.hasNextInt()) {
                System.out.print("⚠ Eso no es un número válido. Intenta otra vez: ");
                scanner.next(); // Limpiar entrada inválida
            }

            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("🔻 Demasiado bajo.");
                intentos++;
            } else if (intento > numeroSecreto) {
                System.out.println("🔺 Demasiado alto.");
                intentos++;
            } else {
                System.out.println("🎉 ¡Felicidades! Adivinaste el número.");
                System.out.println("👍 ¡Has necesitado: " + intentos + " intento(s)!");
            }
        }

        scanner.close();
    }
}
