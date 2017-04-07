package ch.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GradeCalculatorTest {

    @Test
    public void calculateAverage_onlyOneGrade() {
        final GradeCalculator gradeCalculator = new GradeCalculator();

        final int result = gradeCalculator.calculate(1);

        assertEquals(1, result);
    }
}
