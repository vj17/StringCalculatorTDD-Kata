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

    @Test
    public void testStringWithTwoSingleDigitNumbers() {
        Assertions.assertEquals(18, calculator.Add("9,9"));
    }

    @Test
    public void testStringWithTwoDoubleDigitNumbers() {
        Assertions.assertEquals(198, calculator.Add("99,99"));
    }

    @Test
    public void testStringWithTwoNumbersOneSingleDigitOneDoubleDigit() {
        Assertions.assertEquals(108, calculator.Add("9,99"));
    }

    @Test
    public void testStringWithTwoNumbersTwoTripleDigits() {
        Assertions.assertEquals(1998, calculator.Add("999,999"));
    }

    @Test
    public void testStringWithTwoNumbersOneTripleDigitOneSingleDigit() {
        Assertions.assertEquals(1008, calculator.Add("999,9"));
    }
}
