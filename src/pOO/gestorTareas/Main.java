package pOO.gestorTareas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Para leer entrada del usuario
        GestorTareas gestor = new GestorTareas(); // Creamos una instancia del gestor
        int opcion; // Para almacenar la opción del menú

        do {
            // Menú interactivo en consola
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Ver todas las tareas");
            System.out.println("3. Ver tareas pendientes");
            System.out.println("4. Marcar tarea como completada");
            System.out.println("0. Salir");
            System.out.print("\nOpción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea pendiente

            // Lógica del menú
            switch (opcion) {
                case 1:
                    // Solicita datos para una nueva tarea
                    System.out.print("\nTítulo: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Descripción: ");
                    String descripcion = scanner.nextLine();
                    gestor.agregarTarea(titulo, descripcion);
                    break;

                case 2:

                    gestor.mostrarTareas();
                    break;

                case 3:
                    gestor.mostrarTareasPendientes();
                    break;

                case 4:
                    System.out.print("\nNúmero de tarea a completar: ");
                    int indice = scanner.nextInt();
                    gestor.marcarTareaComoCompletada(indice);
                    break;

                case 0:
                    System.out.println("\nSaliendo...");
                    break;

                default:
                    System.out.println("\nOpción inválida.");
            }

        } while (opcion != 0); // El programa sigue hasta que el usuario elija salir

        scanner.close(); // Buen hábito: cerrar recursos
    }
}
