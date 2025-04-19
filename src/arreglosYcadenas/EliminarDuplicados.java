package arreglosYcadenas;

import java.util.HashSet;

public class EliminarDuplicados {

    //Dado un array de números enteros,
    //eliminar los elementos duplicados y mostrar el array sin repeticiones.
    public static void main(String[] args) {
        int[] numeros = {1, 2, 2, 3, 4, 4, 5};

        // Usar un HashSet para eliminar duplicados
        HashSet<Integer> set = new HashSet<>();
        for (int num : numeros) {
            set.add(num);
        }

        // Mostrar el array sin duplicados
        System.out.println("Array sin duplicados: " + set);
    }
}
