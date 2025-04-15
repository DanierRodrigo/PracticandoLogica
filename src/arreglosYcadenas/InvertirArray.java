package arreglosYcadenas;

public class InvertirArray {

    //Dado un array de números enteros, invertir el orden de sus elementos.
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

    // Invertir el array recorriendo la mitad
        int n = numeros.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[n - i - 1];  //Se intercambia el elemento actual con su opuesto en el final del array
            numeros[n - i - 1] = temp;
        }

        // Mostrar el array invertido
        System.out.println("Array invertido:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
