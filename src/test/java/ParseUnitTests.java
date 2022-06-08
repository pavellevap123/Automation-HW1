import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParseUnitTests {

    @Test
    public void testParseToDoubleValid() {
        assertEquals(4.0, ParseUtil.parseToDouble("4"), "Parsing to to failed");
    }

    @Test
    public void testParseToDoubleNotValid() {
        assertThrows(NumberFormatException.class, () -> ParseUtil.parseToDouble("e"));
    }

    @Test
    public void testParseValidOperator() {
        assertDoesNotThrow(() -> ParseUtil.parseOperator("/"));
    }

    @Test
    public void testParseNotValidOperator() {
        assertThrows(IncorrectOperatorException.class, () -> ParseUtil.parseOperator("e"));
    }
}
