package arreglosYcadenas;

public class BuscarElemento {

    //Dado un array de números enteros, verificar si un número específico está presente en el array.
    public static void main(String[] args) {
        int[] numeros = {12, 34, 56, 78, 90};
        int buscar = 56;
        boolean encontrado = false;

        // Buscar el número en el array
        for (int num : numeros) {
            if (num == buscar) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El número " + buscar + " está en el array.");
        } else {
            System.out.println("El número " + buscar + " no está en el array.");
        }
    }
}
