package ordenadores;

public class OrdenarPorContagemSimples implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
           int max = findMax(array);
           int[] countArray = new int[max + 1];

    for (int i : array) {
        countArray[i]++;
    }
    int index = 0;
    for (int i = 0; i < countArray.length; i++) {
        while (countArray[i] > 0) {
            array[index++] = i;
            countArray[i]--;
        }
    }
        
           
        return array;
    }
    private int findMax(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    
}
