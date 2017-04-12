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
}
