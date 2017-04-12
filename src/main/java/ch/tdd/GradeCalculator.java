package ch.tdd;

public class GradeCalculator {
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
