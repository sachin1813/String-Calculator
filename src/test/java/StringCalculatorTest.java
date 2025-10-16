import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    void testEmptyStringReturnsZero() {
        assertEquals(0, new StringCalculator().add(""));
    }
}
