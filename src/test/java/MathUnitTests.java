import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class MathUnitTests {

    @ParameterizedTest
    @CsvSource(value = {"2, 5, 7", "-6, 3, -3", "-1, -1, -2"})
    public void testSummarizeCountWithOperator(int firstValue, int lastValue, int result) throws IncorrectOperatorException {
        assertEquals(result, MathUtil.count(firstValue, lastValue, "+"), "Wrong summarize calculation!");
    }

    @ParameterizedTest
    @CsvSource(value = {"12, 5, 7", "-6, 3, -9", "-2, -1, -1"})
    public void testSubtractCountWithOperator(int firstValue, int lastValue, int result) throws IncorrectOperatorException {
        assertEquals(result, MathUtil.count(firstValue, lastValue, "-"), "Wrong subtract calculation!");
    }

    @ParameterizedTest
    @CsvSource(value = {"2, 5, 10", "-6, 3, -18", "-12, -2, 24"})
    public void testMultiplyCountWithOperator(int firstValue, int lastValue, int result) throws IncorrectOperatorException {
        assertEquals(result, MathUtil.count(firstValue, lastValue, "*"), "Wrong multiply calculation!");
    }

    @ParameterizedTest
    @CsvSource(value = {"10, 5, 2", "-6, 3, -2", "-12, -2, 6"})
    public void testDivisionCountWithOperator(int firstValue, int lastValue, int result) throws IncorrectOperatorException {
        assertEquals(result, MathUtil.count(firstValue, lastValue, "/"), "Wrong division calculation!");
    }

    @Test
    public void testCountWithInvalidOperator() {
        assertThrows(IncorrectOperatorException.class, () -> MathUtil.count(21, 3, "e"));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ZeroDivisionException.class, () -> MathUtil.checkByZeroDivision("/", 0));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 1})
    public void testDivisionByNonZero(int value) {
        assertDoesNotThrow(() -> MathUtil.checkByZeroDivision("/", value));
    }
}
