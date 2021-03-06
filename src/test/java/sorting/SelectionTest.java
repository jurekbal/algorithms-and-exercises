package sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectionTest {

    @Test
    void intArrayMustBeSortedAsc() {
        // given
        Sort sort = new Selection();

        int[] unsortedArrayEven = {7, 3 ,56, -98, 0, 3, 43, 12, 3, 1};
        int[] unsortedArrayOdd = {7, 3 ,56, -98, 0, 3, 12, 3, 1};
        int[] unsortedArrayOne = {7};
        int[] unsortedArrayEmpty = {};
        int[] sortedExpectedArrayEven = Arrays.copyOf(unsortedArrayEven, unsortedArrayEven.length);
        int[] sortedExpectedArrayOdd = Arrays.copyOf(unsortedArrayOdd, unsortedArrayOdd.length);
        int[] sortedExpectedArrayOne = Arrays.copyOf(unsortedArrayOne, unsortedArrayOne.length);
        int[] sortedExpectedArrayEmpty = Arrays.copyOf(unsortedArrayEmpty, unsortedArrayEmpty.length);
        //when
        Arrays.sort(sortedExpectedArrayEven);
        Arrays.sort(sortedExpectedArrayOdd);
        sort.sortAsc(unsortedArrayEven);
        sort.sortAsc(unsortedArrayOdd);
        sort.sortAsc(unsortedArrayOne);
        sort.sortAsc(unsortedArrayEmpty);
        //then
        assertArrayEquals(unsortedArrayEven, sortedExpectedArrayEven);
        assertArrayEquals(unsortedArrayOdd, sortedExpectedArrayOdd);
        assertArrayEquals(unsortedArrayOne, sortedExpectedArrayOne);
        assertArrayEquals(unsortedArrayEmpty, sortedExpectedArrayEmpty);
    }
}