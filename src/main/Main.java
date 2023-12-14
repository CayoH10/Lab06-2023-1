import java.util.Arrays;

import ordenadores.Ordenador;
import ordenadores.OrdenarPorContagemSimples;
import ordenadores.OrdenarQuick;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] array = { 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int i = partition(array, 0, array.length - 1);
        System.out.println("valor de i " + i);
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        System.out.println("Ordenar contagem simples:\n");
        int[] array2 = {4, 2, 7, 1, 5, 3};
        System.out.println("Array original: " + Arrays.toString(array2));

        Ordenador ordenador = new OrdenarPorContagemSimples();
        ordenador.ordene(array2);
        System.out.println("Array ordenado: " + Arrays.toString(array2));
        System.out.println("Ordenar Particiona:\n");
        int[] array3 = {4, 7, 2, 1, 5, 3};

        System.out.println("Array original: " + Arrays.toString(array3));

        Ordenador ordenador2 = new OrdenarQuick();
        ordenador2.ordene(array3);

        System.out.println("Array ordenado: " + Arrays.toString(array3));
    }


    public static int partition(int[] values, int left, int right) {
        
        int pivot = values[left];
        int i = left;

        for (int j = left + 1; j <= right; j++) {
            if (values[j] <= pivot) {
                i+=1;
                int temp = values[i];
                values[i] = values[j];
                values[j] = temp;
            }
        }

        // troca pivot (values[left]) com i.
        int temp = values[i];
        values[i] = values[left];
        values[left] = temp;
        
        return i; 
    }
}
