package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SeatingStudentsTest {

    @Test
    void seatCombinationsMustReturnZeroOrMore() {
//        given
        int[] array = {};
//        when
        int result = SeatingStudents.seatCombinations(array);
        // then
        assertTrue(result >= 0);
    }

    @Test
    void seatCombinationMustReturnCorrectResultTestCase1() {
        int[] array = {12, 2, 6, 7, 11};

        int result = SeatingStudents.seatCombinations(array);

        assertEquals(6, result);
    }
}
