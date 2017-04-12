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
        final double result = gradeCalculator.calculate(1);

        assertEquals(1, result, 0.0);
    }

    @Test
    public void calculateAverage_twoGrades() throws Exception {
        final double result = gradeCalculator.calculateMultiple(2, 3);

        assertEquals(2.5, result, 0.0);
    }

    @Test
    public void calculcateAverage_threeGrades() throws Exception {
        double result = gradeCalculator.calculateMultiple(2, 3, 5);

        assertEquals(3.33, result, 0.01);
    }

    @Test
    public void calculateAverage_twoOddGrades() throws Exception {
        double result = gradeCalculator.calculateMultiple(2.3, 1.7);

        assertEquals(2.0, result, 0.0);
    }
}
