import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.package1.StringCalculator;

public class StringCalculatorTest {

    @Test
    public void testEmptyString() {
        StringCalculator calculator = new StringCalculator();
        Assertions.assertEquals(0, calculator.Add(""));
    }
}
