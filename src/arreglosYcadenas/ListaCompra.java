package arreglosYcadenas;

public class ListaCompra {
    public static void main(String[] args) {
        String[] compras = {"Pan", "Leche", "Huevos", "Queso", "Café"};

        for (int i = 0; i < compras.length; i++) {
            System.out.println("Producto " + (i+1) + ": " + compras[i]);
        }
    }
}
