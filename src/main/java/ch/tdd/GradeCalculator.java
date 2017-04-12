package ch.tdd;

public class GradeCalculator {

    public double calculateMultipleWeighted(WeightedGrade... weightedGrade) {
        double result = 0.0;
        int totalCreditPoints = 0;
        for (WeightedGrade grade : weightedGrade) {
            result += grade.getValue();
            totalCreditPoints += grade.getCreditPoints();
        }
        return result / totalCreditPoints;
    }

}
