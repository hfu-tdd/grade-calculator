package ch.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TableOfRecordsTest {

    @Test
    public void calculateAverage_onlyOneGrade() {
        final List<WeightedGrade> weightedGrades = Arrays.asList(new WeightedGrade(1.0, 5));
        final TableOfRecords tableOfRecords = new TableOfRecords(weightedGrades);

        final double result = tableOfRecords.calculateMultipleWeighted();

        Assert.assertEquals(1, result, 0.0);
    }

    @Test
    public void calculateAverage_twoGrades() throws Exception {
        final List<WeightedGrade> weightedGrades = Arrays.asList(new WeightedGrade(2.0, 5), new WeightedGrade(3.0, 5));
        final TableOfRecords tableOfRecords = new TableOfRecords(weightedGrades);

        final double result = tableOfRecords.calculateMultipleWeighted();

        assertEquals(2.5, result, 0.0);
    }

    @Test
    public void calculcateAverage_threeGrades() throws Exception {
        final List<WeightedGrade> weightedGrades = Arrays.asList(new WeightedGrade(2.0, 5), new WeightedGrade(3.0, 5), new WeightedGrade(5.0, 5));
        final TableOfRecords tableOfRecords = new TableOfRecords(weightedGrades);

        double result = tableOfRecords.calculateMultipleWeighted();

        assertEquals(3.33, result, 0.01);
    }

    @Test
    public void calculateAverage_twoOddGrades() throws Exception {
        final List<WeightedGrade> weightedGrades = Arrays.asList(new WeightedGrade(2.3, 5), new WeightedGrade(1.7, 5));
        final TableOfRecords tableOfRecords = new TableOfRecords(weightedGrades);

        double result = tableOfRecords.calculateMultipleWeighted();

        assertEquals(2.0, result, 0.0);
    }

    @Test
    public void calculateAverage_weightedGrade() throws Exception {
        final List<WeightedGrade> weightedGrades = Arrays.asList(new WeightedGrade(2.3, 8));
        final TableOfRecords tableOfRecords = new TableOfRecords(weightedGrades);

        double result = tableOfRecords.calculateMultipleWeighted();

        assertEquals(2.3, result, 0.0);
    }

    @Test
    public void calculateAverage_twoWeightedGrades() throws Exception {
        final List<WeightedGrade> weightedGrades = Arrays.asList(new WeightedGrade(4.0, 8), new WeightedGrade(1.0, 4));
        final TableOfRecords tableOfRecords = new TableOfRecords(weightedGrades);

        double result = tableOfRecords.calculateMultipleWeighted();

        assertEquals(3, result, 0.0);
    }
}
