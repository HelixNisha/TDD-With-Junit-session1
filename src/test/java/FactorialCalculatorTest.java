import org.example.FactorialCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialZero() {
        FactorialCalculator calculator = new FactorialCalculator();
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    public void testFactorialOne() {
        FactorialCalculator calculator = new FactorialCalculator();
        assertEquals(1, calculator.factorial(1));
    }

    @Test
    public void testFactorialPositive() {
        FactorialCalculator calculator = new FactorialCalculator();
        assertEquals(2, calculator.factorial(2));
        assertEquals(6, calculator.factorial(3));
        assertEquals(24, calculator.factorial(4));
        // Add more test cases as needed
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        FactorialCalculator calculator = new FactorialCalculator();
        calculator.factorial(-1); // This should throw an IllegalArgumentException
    }

}
