package ordenadores;
public class OrdenarQuick implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        quickParticio(array, 0,  array.length - 1);
        return array;
    }

    public int quickParticio(int[] array, int inicio, int fim){
        if (inicio < fim) {
            int pivotIndex = particiona(array, inicio, fim);

            quickParticio(array, inicio, pivotIndex - 1);
            quickParticio(array, pivotIndex + 1, fim);
        }
        return 0;
    }
    private int particiona(int[] array, int inicio, int fim) {
        int pivot = array[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, fim);
        return i + 1;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
}
