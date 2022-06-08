import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTests {

    @Test
    public void testMathSummarize() {
        assertEquals(4, MathUtil.summarize(2, 2), "2 + 2 = 4");
    }

    @Test
    public void testMathSubtract() {
        assertEquals(5, MathUtil.subtract(10, 5), "10 - 5 = 5");
    }

    @Test
    public void testMathMultiply() {
        assertEquals(9, MathUtil.multiply(3, 3), "3 * 3 = 9");
    }

    @Test
    public void testMathDivide() {
        assertEquals(5, MathUtil.divide(10, 2), "10 / 2 = 5");
    }

    @Test
    public void testSummarizeCountWithOperator() {
        assertEquals(10, MathUtil.count(7, 3, "+"));
    }

    @Test
    public void testSubtractCountWithOperator() {
        assertEquals(4, MathUtil.count(7, 3, "-"));
    }

    @Test
    public void testMultiplyCountWithOperator() {
        assertEquals(21, MathUtil.count(7, 3, "*"));
    }

    @Test
    public void testDivisionCountWithOperator() {
        assertEquals(7, MathUtil.count(21, 3, "/"));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ZeroDivisionException.class, () -> MathUtil.checkByZeroDivision("/", 0));
    }

    @Test
    public void testDivisionByNonZero() {
        assertDoesNotThrow(() -> MathUtil.checkByZeroDivision("/", 1));
    }

}
