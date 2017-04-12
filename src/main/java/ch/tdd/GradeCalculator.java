package ch.tdd;

public class GradeCalculator {

    public double calculate(int i) {
        return calculateMultiple(i);
    }

    public double calculateMultiple(int... grades) {
        double sumOfGrades = 0.0;
        for (int grade : grades) {
            sumOfGrades += grade;
        }
        return sumOfGrades / grades.length;
    }
}
