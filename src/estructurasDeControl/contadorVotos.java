package estructurasDeControl;

import java.util.Scanner;

public class contadorVotos {

    //Crea un programa que simule una votación donde los usuarios puedan votar por diferentes candidatos.
    // El programa debe mostrar los resultados al final.
        public static void main(String[] args) {

            //Llamamos a la clase Scanner e inicializamos las variables
            Scanner scanner = new Scanner(System.in);

            int votosA = 0, votosB = 0, votosC = 0;
            String voto;

            //Creamos el bucle while
            while (true) {
                System.out.print("Ingrese su voto (A, B, C) o 'fin' para terminar: ");
                voto = scanner.nextLine().toUpperCase();

                //El bucle continuará hasta que se ingrese la palabra fin
                if (voto.equalsIgnoreCase("FIN")) {   //Da igual como sea escrito con .equalsIgnoreCase
                    break;
                }
                //Establecemos los distintos "case" del switch
                switch (voto) {
                    case "A":
                        votosA++;
                        break;
                    case "B":
                        votosB++;
                        break;
                    case "C":
                        votosC++;
                        break;
                    default:
                        System.out.println("Voto no válido. Intente nuevamente.");
                        break;
                }
            }

            //Mostramos por pantalla los resultados de los contadores
            System.out.println("\nResultados de la votación:");
            System.out.println("Candidato A: " + votosA + " votos");
            System.out.println("Candidato B: " + votosB + " votos");
            System.out.println("Candidato C: " + votosC + " votos");
        }
    }

