package estructurasDeControl;

import java.util.Scanner;

public class calculadoraDescuento {

    //Implementa un programa que calcule el descuento aplicado a un producto,
    //dependiendo de su precio y de si el cliente es miembro de un programa de fidelización.
    public static void main(String[] args) {

        //Llamamos a la clase Scanner y declaramos las variables
        Scanner scanner = new Scanner(System.in);
        double precioOriginal, precioConDescuento;
        String esMiembro;

        //Pedimos al usuario el precio del producto y lo almacenamos
        System.out.print("Ingrese el precio original del producto: ");
        precioOriginal = scanner.nextDouble();

        //Preguntamos si es miembro del programa de fidelización
        System.out.print("¿Es miembro del programa de fidelización? (si/no): ");
        esMiembro = scanner.next();

        if (esMiembro.equalsIgnoreCase("si")) {
            precioConDescuento = precioOriginal * 0.9; // Descuento del 10%
        } else {
            precioConDescuento = precioOriginal * 0.95; // Descuento del 5%
        }

        System.out.println("El precio con descuento es: " + precioConDescuento);
    }
}
