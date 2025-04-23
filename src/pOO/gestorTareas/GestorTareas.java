package pOO.gestorTareas;

import java.util.ArrayList;
import java.util.List;

public class GestorTareas {
    // Lista donde se almacenan todas las tareas
    private List<Tarea> tareas;

    // Constructor: inicializa la lista vacía
    public GestorTareas() {
        tareas = new ArrayList<>();
    }

    // Agrega una nueva tarea a la lista
    public void agregarTarea(String titulo, String descripcion) {
        tareas.add(new Tarea(titulo, descripcion));
    }

    // Muestra todas las tareas (completadas y no completadas)
    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas aún.");
            return;
        }
        // Itera y muestra cada tarea con su índice
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println(i + ". " + tareas.get(i));
        }
    }

    // Muestra solo las tareas que aún no están completadas
    public void mostrarTareasPendientes() {
        for (int i = 0; i < tareas.size(); i++) {
            if (!tareas.get(i).estaCompletada()) {
                System.out.println(i + ". " + tareas.get(i));
            }
        }
    }

    // Marca una tarea como completada dado su índice
    public void marcarTareaComoCompletada(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.get(indice).marcarComoCompletada();
            System.out.println("Tarea marcada como completada.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}

