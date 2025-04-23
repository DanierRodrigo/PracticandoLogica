package pOO.gestorTareas;

public class Tarea {
    // Atributos privados para encapsular la información de cada tarea
    private String titulo;
    private String descripcion;
    private boolean completada;

    // Constructor: inicializa la tarea con título y descripción. Por defecto, no está completada
    public Tarea(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.completada = false;
    }

    // Métodos 'getter' para acceder a los atributos desde fuera
    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean estaCompletada() {
        return completada;
    }

    // Función para marcar la tarea como completada
    public void marcarComoCompletada() {
        this.completada = true;
    }

    // Función que devuelve una representación en texto de la tarea
    @Override
    public String toString() {
        // Agrega una "marca" visual si está completada o no
        return (completada ? "[✔] " : "[ ] ") + titulo + ": " + descripcion;
    }
}
