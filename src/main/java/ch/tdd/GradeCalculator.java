package ch.tdd;

import java.util.Arrays;

public class GradeCalculator {

    public double calculateMultipleWeighted(WeightedGrade... weightedGrade) {
        return calculateMultipleWeighted(new TableOfRecords(Arrays.asList(weightedGrade)));
    }


    public double calculateMultipleWeighted(TableOfRecords tableOfRecords) {
        double result = 0.0;
        int totalCreditPoints = 0;
        for (WeightedGrade grade : tableOfRecords.getWeightedGrade()) {
            result += grade.getValue();
            totalCreditPoints += grade.getCreditPoints();
        }
        return result / totalCreditPoints;
    }



}
