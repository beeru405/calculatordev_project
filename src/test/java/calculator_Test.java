import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testFactorialPass() {
        assertEquals(120, calculator.fact(5), 0.001); // 5! = 120
    }

    @Test
    public void testFactorialFail() {
        assertEquals(Double.NaN, calculator.fact(-3), 0.001); // Factorial of a negative number should return NaN
    }

    @Test
    public void testSquareRootPass() {
        assertEquals(4, calculator.sqroot(16), 0.001); // Square root of 16 is 4
    }

    @Test
    public void testSquareRootFail() {
        assertEquals(Double.NaN, calculator.sqroot(-9), 0.001); // Square root of a negative number should return NaN
    }

    @Test
    public void testPowerPass() {
        assertEquals(8, calculator.power(2, 3), 0.001); // 2^3 = 8
    }

    @Test
    public void testPowerFail() {
        assertEquals(Double.NaN, calculator.power(0, -2), 0.001); // Power of a non-positive base should return NaN
    }

    @Test
    public void testModulusPass() {
        assertEquals(1, calculator.modulus(7, 2), 0.001); // 7 % 2 = 1
    }

    @Test
    public void testModulusFail() {
        assertEquals(Double.NaN, calculator.modulus(10, 0), 0.001); // Modulus by zero should return NaN
    }

    // Add more test cases as needed for other functionalities

    @Test
    public void testInvalidInput() {
        // Example of testing invalid input (non-numeric input)
        // This test assumes that entering a non-numeric value will result in an InputMismatchException
        try {
            // Replace the following line with actual code that triggers an InputMismatchException
            calculator.main(new String[]{"non-numeric-input"});
            fail("Expected InputMismatchException, but it did not occur.");
        } catch (InputMismatchException e) {
            // This is the expected outcome
        }
    }
}
