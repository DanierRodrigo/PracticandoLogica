package fundamentosJava.strings;

import java.util.Scanner;

public class ValidadorEmail {

    //Crea un programa que valide si una dirección de correo electrónico ingresada es válida.
    // Considera que un correo electrónico válido debe tener la forma: usuario@dominio.com
    public static void main(String[] args) {

        //Llamamos a la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Pedimos el correo al usuario y guardamos la variable
        System.out.print("Introduce un correo electrónico: ");
        String correo = scanner.nextLine();

        // Verificar que contiene '@'
        if (!correo.contains("@")) {
            System.out.println("Correo inválido: No contiene '@'");
            return;
        }

        // Verificar que '@' no está al inicio o final
        int posicionArroba = correo.indexOf("@");
        if (posicionArroba == 0 || posicionArroba == correo.length() - 1) {
            System.out.println("Correo inválido: '@' en posición incorrecta");
            return;
        }

        // Separar correo en usuario y dominio
        String[] partes = correo.split("@");
        String usuario = partes[0];
        String dominio = partes[1];

        System.out.println("Usuario: " + usuario);
        System.out.println("Dominio: " + dominio);
    }
}
