package ch.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class GradeCalculatorTest {

    private GradeCalculator gradeCalculator;

    @Before
    public void setUp() throws Exception {
        gradeCalculator = new GradeCalculator();
    }

    @Test
    public void calculateAverage_onlyOneGrade() {
        final double result = gradeCalculator.calculateMultipleWeighted(new TableOfRecords(Arrays.asList(new WeightedGrade(1.0, 5))));

        Assert.assertEquals(1, result, 0.0);
    }

    @Test
    public void calculateAverage_twoGrades() throws Exception {
        final double result = gradeCalculator.calculateMultipleWeighted(new TableOfRecords(Arrays.asList(new WeightedGrade(2.0, 5), new WeightedGrade(3.0, 5))));

        assertEquals(2.5, result, 0.0);
    }

    @Test
    public void calculcateAverage_threeGrades() throws Exception {
        double result = gradeCalculator.calculateMultipleWeighted(new TableOfRecords(Arrays.asList(new WeightedGrade(2.0, 5), new WeightedGrade(3.0, 5), new WeightedGrade(5.0, 5))));

        assertEquals(3.33, result, 0.01);
    }

    @Test
    public void calculateAverage_twoOddGrades() throws Exception {
        double result = gradeCalculator.calculateMultipleWeighted(new TableOfRecords(Arrays.asList(new WeightedGrade(2.3, 5), new WeightedGrade(1.7, 5))));

        assertEquals(2.0, result, 0.0);
    }

    @Test
    public void calculateAverage_weightedGrade() throws Exception {
        double result = gradeCalculator.calculateMultipleWeighted(new TableOfRecords(Arrays.asList(new WeightedGrade(2.3, 8))));

        assertEquals(2.3, result, 0.0);
    }

    @Test
    public void calculateAverage_twoWeightedGrades() throws Exception {
        double result = gradeCalculator.calculateMultipleWeighted(new TableOfRecords(Arrays.asList(new WeightedGrade(4.0, 8), new WeightedGrade(1.0, 4))));

        assertEquals(3, result, 0.0);
    }
}
