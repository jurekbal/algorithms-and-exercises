package sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class QuickTest {

    @Test
    public void testIntsArrayMustBeSortedAscByQuickAlgo() {
        // given
        Sort sort = new Quick();

        int[] testArrayEven = Arrays.copyOf(TestData.unsortedArrayEven, TestData.unsortedArrayEven.length);
        int[] testArrayOdd = Arrays.copyOf(TestData.unsortedArrayOdd, TestData.unsortedArrayOdd.length);
        int[] testArrayOne = Arrays.copyOf(TestData.unsortedArrayOne, TestData.unsortedArrayOne.length);
        int[] testArrayEmpty = Arrays.copyOf(TestData.unsortedArrayEmpty, TestData.unsortedArrayEmpty.length);
        int[] expectedArrayEven = Arrays.copyOf(TestData.unsortedArrayEven, TestData.unsortedArrayEven.length);
        int[] expectedArrayOdd = Arrays.copyOf(TestData.unsortedArrayOdd, testArrayOdd.length);
        int[] expectedArrayOne = Arrays.copyOf(TestData.unsortedArrayOne, testArrayOne.length);
        int[] expectedArrayEmpty = Arrays.copyOf(TestData.unsortedArrayEmpty, testArrayEmpty.length);
        //when
        Arrays.sort(expectedArrayEven);
        Arrays.sort(expectedArrayOdd);
        sort.sortAsc(testArrayEven);
        sort.sortAsc(testArrayOdd);
        sort.sortAsc(testArrayOne);
        sort.sortAsc(testArrayEmpty);
        //then
        assertArrayEquals(testArrayEven, expectedArrayEven);
        assertArrayEquals(testArrayOdd, expectedArrayOdd);
        assertArrayEquals(testArrayOne, expectedArrayOne);
        assertArrayEquals(testArrayEmpty, expectedArrayEmpty);
    }
}