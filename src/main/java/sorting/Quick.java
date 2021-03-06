package sorting;

/*
Quick sort algorithm implementation (invented by Sir Charles Antony Richard Hoare, 1960)
Recursive implementation
 */
public class Quick implements Sort{
    @Override
    public void sortAsc(int[] array) {
        quick(array, 0, array.length -1 );
    }

    private void quick(int[] array, int left, int right) {
        if (right <= left) {
            return;
        }

        int i = left - 1;
        int j = right + 1;
        int pivot = array[(left+right) / 2];

        do {
            while(pivot > array[++i]);
            while(pivot < array[--j]);
            if(i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            } else {
                break;
            }
        } while (true);

        if (j > left) {
            quick(array, left, j);
        }
        if (i < right) {
            quick(array, i ,right);
        }
    }

}
