package sorting;

public class Selection implements Sort {

    public void sortAsc(int[] array) {
        int min;
        int minIndex = 0;
        boolean wasSelected;

        for (int i = 0; i < array.length; i++) {
            wasSelected = false;
            min = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                    wasSelected = true;
                }
            }
            if (wasSelected) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            } else {
                break;
            }

        }
    }
}
