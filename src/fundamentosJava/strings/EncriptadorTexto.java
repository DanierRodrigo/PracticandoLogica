package fundamentosJava.strings;

import java.util.Scanner;

public class EncriptadorTexto {

    //Implementa un programa que encripte un mensaje usando el Cifrado César
    //Un tipo de cifrado en el que cada letra se desplaza un número fijo de posiciones en el alfabeto.
    public static void main(String[] args) {

        //Declaramos las variables para el cifrado
        String abc = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789 ";
        int desplazamiento = 3;

        //Llamamos a la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Pedimos el mensaje al usuario y validamos que contenga los caracteres de nuestro abecedario declarado
        System.out.print("Ingrese el mensaje a encriptar: ");
        String mensaje = scanner.nextLine();

        // Verificamos que todos los caracteres del mensaje estén dentro del abecedario definido
        for (int i = 0; i < mensaje.length(); i++) {
            if (abc.indexOf(mensaje.charAt(i)) == -1) { // Si el carácter no está en 'abc', por eso posición -1
                System.out.println("Cadena de texto inválida, reinicie el programa");
                scanner.close();
                return;
            }
        }

        //Codificación del mensaje con el cifrado César
        StringBuilder mensajeCifrado = new StringBuilder();

        for (int i = 0; i < mensaje.length(); i++) {
            char letra = mensaje.charAt(i);
            int indice = abc.indexOf(letra); // Encuentra la posición del carácter en 'abc'

            // Calcula el nuevo índice con el desplazamiento (aplicando el módulo para el rango)
            int nuevoIndice = (indice + desplazamiento) % abc.length();  // % asegura que no se salga del rango de caracteres

            // Añadimos el carácter desplazado al mensaje cifrado
            mensajeCifrado.append(abc.charAt(nuevoIndice));  // Append concatena nuevo caracter a un objeto StringBuilder
        }

        // Mostrar el mensaje cifrado
        System.out.println("Mensaje cifrado: " + mensajeCifrado.toString());  // toString recorre el mensaje

        scanner.close();
    }

}
