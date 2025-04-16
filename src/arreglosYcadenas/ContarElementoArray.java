package arreglosYcadenas;

public class ContarElementoArray {

    //Dado un array de números enteros, contar cuántas veces aparece un número específico.
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 3, 5, 3};
        int buscar = 3;
        int contador = 0;

        // Contar cuántas veces aparece el número
        for (int num : numeros) {
            if (num == buscar) {
                contador++;
            }
        }

        System.out.println("El número " + buscar + " aparece " + contador + " veces.");
    }
}
