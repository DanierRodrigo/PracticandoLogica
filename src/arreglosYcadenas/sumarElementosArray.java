package arreglosYcadenas;

public class sumarElementosArray {

    //Dado un array de números enteros, sumar todos los elementos y devolver el resultado.
    public static void main(String[] args) {

        //Declaramos las variables
        int[] numeros = {1, 2, 3, 4, 5};
        int suma = 0;

        // Sumar todos los elementos del array
        for (int num : numeros) {
            suma += num;
        }

        System.out.println("La suma de los elementos es: " + suma);
    }
}
