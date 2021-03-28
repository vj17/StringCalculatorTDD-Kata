import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.package1.StringCalculator;

public class StringCalculatorTest {

    StringCalculator calculator = new StringCalculator();

    @Test
    public void testEmptyString() {
        Assertions.assertEquals(0, calculator.Add(""));
    }

    @Test
    public void testStringWithOneNumber() {
        Assertions.assertEquals(2147483647, calculator.Add("2147483647"));
    }
}
