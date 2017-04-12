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

    public double calculateWeighted(double v, int i) {
        return v;
    }

    public double calculateWeighted(double grade1, int weight1, double grade2, int weight2) {
        return ((grade1 * weight1) + (grade2 * weight2)) / (weight1 + weight2);
    }
}
