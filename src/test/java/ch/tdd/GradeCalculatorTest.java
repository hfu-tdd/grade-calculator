package ch.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GradeCalculatorTest {

    private GradeCalculator gradeCalculator;

    @Before
    public void setUp() throws Exception {
        gradeCalculator = new GradeCalculator();
    }

    @Test
    public void calculateAverage_onlyOneGrade() {
        final int result = gradeCalculator.calculate(1);

        assertEquals(1, result);
    }

    @Test
    public void calculateAverage_twoGrades() throws Exception {
        final double result = gradeCalculator.calculate(2, 3);

        assertEquals(2.5, result, 0.0);
    }
}
