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
        TableOfRecords tableOfRecords = new TableOfRecords(Arrays.asList(new WeightedGrade(1.0, 5)));

        final double result = gradeCalculator.calculateMultipleWeighted(tableOfRecords);

        Assert.assertEquals(1, result, 0.0);
    }

    @Test
    public void calculateAverage_twoGrades() throws Exception {
        TableOfRecords tableOfRecords = new TableOfRecords(Arrays.asList(new WeightedGrade(2.0, 5), new WeightedGrade(3.0, 5)));

        final double result = gradeCalculator.calculateMultipleWeighted(tableOfRecords);

        assertEquals(2.5, result, 0.0);
    }

    @Test
    public void calculcateAverage_threeGrades() throws Exception {
        TableOfRecords tableOfRecords = new TableOfRecords(Arrays.asList(new WeightedGrade(2.0, 5), new WeightedGrade(3.0, 5), new WeightedGrade(5.0, 5)));

        double result = gradeCalculator.calculateMultipleWeighted(tableOfRecords);

        assertEquals(3.33, result, 0.01);
    }

    @Test
    public void calculateAverage_twoOddGrades() throws Exception {
        TableOfRecords tableOfRecords = new TableOfRecords(Arrays.asList(new WeightedGrade(2.3, 5), new WeightedGrade(1.7, 5)));

        double result = gradeCalculator.calculateMultipleWeighted(tableOfRecords);

        assertEquals(2.0, result, 0.0);
    }

    @Test
    public void calculateAverage_weightedGrade() throws Exception {
        TableOfRecords tableOfRecords = new TableOfRecords(Arrays.asList(new WeightedGrade(2.3, 8)));

        double result = gradeCalculator.calculateMultipleWeighted(tableOfRecords);

        assertEquals(2.3, result, 0.0);
    }

    @Test
    public void calculateAverage_twoWeightedGrades() throws Exception {
        TableOfRecords tableOfRecords = new TableOfRecords(Arrays.asList(new WeightedGrade(4.0, 8), new WeightedGrade(1.0, 4)));

        double result = gradeCalculator.calculateMultipleWeighted(tableOfRecords);

        assertEquals(3, result, 0.0);
    }
}
