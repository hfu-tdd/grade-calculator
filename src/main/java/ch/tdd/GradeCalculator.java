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
