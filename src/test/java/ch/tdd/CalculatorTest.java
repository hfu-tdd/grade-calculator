package ch.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void calculateAverage_onlyOneGrade() {
        final Calculator calculator = new Calculator();

        final int result = calculator.calculate(1);

        assertEquals(1, result);
    }
}
