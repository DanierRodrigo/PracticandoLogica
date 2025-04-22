package arreglosYcadenas;

import java.util.Scanner;

public class ValidarCorreo {

    //Pedir al usuario un correo y verificar si tiene un formato válido.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca su email: ");

        String correo = scanner.nextLine();

        if (correo.contains("@") && correo.indexOf("@") > 0 && (correo.endsWith(".com") || correo.endsWith(".es"))) {
            System.out.println("Correo válido");
        } else {
            System.out.println("Correo inválido");
        }
    }
}
