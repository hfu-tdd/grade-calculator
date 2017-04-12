package ch.tdd;

public class GradeCalculator {

    public int calculate(int i) {
        return i;
    }

    public double calculate(int i, int v) {
        return (double)(i + v) / 2;
    }

    public double calculate(int i, int i1, int i2) {
        return (double)(i + i1 + i2) / 3;
    }

    public double calculateMultiple(int... grades) {
        double sumOfGrades = 0.0;
        for (int grade : grades) {
            sumOfGrades += grade;
        }
        return sumOfGrades / grades.length;
    }
}
