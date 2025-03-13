package fundamentosJava.condicionales;

import java.util.Scanner;

public class Descuento {

    //Si una compra es mayor a $100, aplica un 10% de descuento y muestra el total a pagar.
    public static void main(String[] args) {

        //Llamamos a la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Pedimos el valor de la compra al usuario
        System.out.print("Ingrese el importe de su compra: ");

        // Verificamos que la entrada sea un número entero
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Debe ingresar un número válido.");
            scanner.close();
            return;
        }
        //Si pasa la validación, se almacena la variable
        double compra = scanner.nextDouble();

        //Ahora vamos a comprobar si la cantidad supera 100
        if(compra > 100){
            double descuento = compra * 0.1;  //Vamos a coger el valor de compra y le restaremos el descuento
            double total = compra - descuento;
            System.out.println("La compra de valor " + compra + " tendrá un descuento de " + descuento + ", haciendo un total de " + total);
        }else{
            System.out.println("Su compra hace un total de " + compra);
        }
        //Cerramos el Scanner
        scanner.close();
    }
}
