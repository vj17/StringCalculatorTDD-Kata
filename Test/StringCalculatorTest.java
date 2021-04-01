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

    @Test
    public void testStringWithTwoNumbersOneTripleDigitOneDoubleDigit() {
        Assertions.assertEquals(1098, calculator.Add("999,99"));
    }

    @Test
    public void testStringWithTwoNumbersTwoFourDigits() {
        Assertions.assertEquals(19998, calculator.Add("9999,9999"));
    }

    @Test
    public void testStringWithTwoRandomNumbers() {
        int a = (int) Math.round(Math.random() * 1000);
        int b = (int) Math.round(Math.random() * 10000000);
        Assertions.assertEquals(a + b, calculator.Add("" + a + "," + b));
    }

    @Test
    public void testStringWithUnknownAmountOfNumbers() {
        Assertions.assertEquals(126, calculator.Add("9,9,99,9"));
    }

    @Test
    public void testStringWithNewLine() {
        Assertions.assertEquals(6, calculator.Add("1\n2,3"));
    }

    @Test
    public void testStringWithSemicolonDelimiter() {
        Assertions.assertEquals(3, calculator.Add("//;\n1;2"));
    }

    @Test
    public void testStringWithNegativeNumbers() {
        try {
            calculator.Add("-1, 3");
        }
        catch (IllegalArgumentException e) {
            Assertions.assertEquals(e.getMessage(), "Negatives not allowed: -1");
        }
    }
}