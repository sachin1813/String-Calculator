import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    void testEmptyStringReturnsZero() {
        assertEquals(0, new StringCalculator().add(""));
    }

    @Test
    void testSingleNumber() {
        assertEquals(5, new StringCalculator().add("5"));
    }

    @Test
    void testTwoNumbers() {
        assertEquals(3, new StringCalculator().add("1,2"));
    }

    @Test
    void testMultipleNumbersWithoutNewLine() {
        assertEquals(15, new StringCalculator().add("1,2,3,4,5"));
    }

    @Test
    void testMultipleNumbersWithNewLine() {
        assertEquals(18, new StringCalculator().add("4,2\n3,4\n5"));
    }

    @Test
    void testCustomDelimiter() {
        assertEquals(3, new StringCalculator().add("//;\n1;2"));
    }



}
