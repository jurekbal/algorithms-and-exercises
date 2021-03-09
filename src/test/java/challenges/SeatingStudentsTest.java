package challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SeatingStudentsTest {

    @Test
    public void seatCombinationsMustReturnZeroOrMore() {
        // given
        int[] array = {};
        // when
        int result = SeatingStudents.seatCombinations(array);
        // then
        assertThat(result).isGreaterThanOrEqualTo(0);
    }

    @Test
    public void seatCombinationMustReturnCorrectResultTestCase1() {
        int[] array = {12, 2, 6, 7, 11};

        int result = SeatingStudents.seatCombinations(array);

        assertThat(result).isEqualTo(6);
    }
}
