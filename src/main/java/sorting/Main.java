package sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort sort = new Selection();

        int[] myArray = {7, 3 ,56, -98, 0, 3, 43, 12, 3, 1};

        System.out.println(Arrays.toString(myArray));

        sort.sortAsc(myArray);

        System.out.println(Arrays.toString(myArray));
    }
}
