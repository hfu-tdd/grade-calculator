package ch.tdd;

public class WeightedGrade {
    private final double grade;
    private final int creditPoints;

    public WeightedGrade(double grade, int creditPoints) {
        this.grade = grade;
        this.creditPoints = creditPoints;
    }

    public double getGrade() {
        return grade;
    }

    public int getCreditPoints() {
        return creditPoints;
    }
}
