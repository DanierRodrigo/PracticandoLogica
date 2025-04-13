package arreglosYcadenas;

public class MaximoValorArray {

    //Dado un array de números enteros, encontrar el valor máximo.
    public static void main(String[] args) {
        int[] numeros = {15, 22, 8, 41, 33};
        int max = numeros[0];  // Inicializamos el máximo con el primer elemento

        // Comparar cada elemento con el máximo actual
        for (int num : numeros) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("El valor máximo es: " + max);
    }
}
