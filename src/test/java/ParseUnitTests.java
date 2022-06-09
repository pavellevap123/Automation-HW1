import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ParseUnitTests {

    @ParameterizedTest
    @CsvSource(value = {"5, 5", "-6, -6", "0, 0"})
    public void testParseToDoubleValid(double valueToParse, double expectedValue) {
        assertEquals(expectedValue,
                ParseUtil.parseToDouble(String.format("%1$,.2f", valueToParse)),
                "Parsing to double failed");
    }

    @Test
    public void testParseToDoubleNotValid() {
        assertThrows(NumberFormatException.class, () -> ParseUtil.parseToDouble("e"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"+", "-", "*", "/"})
    public void testParseValidOperator(String value) {
        assertDoesNotThrow(() -> ParseUtil.parseOperator(value));
    }

    @Test
    public void testParseNotValidOperator() {
        assertThrows(IncorrectOperatorException.class, () -> ParseUtil.parseOperator("e"));
    }
}
