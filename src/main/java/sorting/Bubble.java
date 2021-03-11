package sorting;

/*
Bubble sort algorithm with flag implementation
 */
public class Bubble implements Sort{
    @Override
    public void sortAsc(int[] array) {

        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapped = true;
                }
            }
        }
    }
}
