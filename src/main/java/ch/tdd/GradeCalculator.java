package ch.tdd;

public class GradeCalculator {

    public double calculate(int i) {
        return calculateMultiple(i);
    }

    public double calculateMultiple(double... grades) {
        double sumOfGrades = 0.0;
        for (double grade : grades) {
            sumOfGrades += grade;
        }
        return sumOfGrades / grades.length;
    }

    public double calculateWeighted(WeightedGrade weightedGrade) {
        return weightedGrade.getGrade();
    }

    public double calculateWeighted(WeightedGrade weightedGrade, WeightedGrade weightedGrade1) {
        return ((weightedGrade.getGrade() * weightedGrade.getCreditPoints()) + (weightedGrade1.getGrade() * weightedGrade1.getCreditPoints())) / (weightedGrade.getCreditPoints() + weightedGrade1.getCreditPoints());
    }

    public double calculateMultipleWeighted(WeightedGrade... weightedGrade) {
        double result = 0.0;
        int totalCreditPoints = 0;
        for (WeightedGrade grade : weightedGrade) {
            result += grade.getGrade() * grade.getCreditPoints();
            totalCreditPoints += grade.getCreditPoints();
        }
        return result / totalCreditPoints;
    }


}
