package ch.tdd;

import java.util.List;

public class TableOfRecords {
    private final List<WeightedGrade> weightedGrade;

    public TableOfRecords(List<WeightedGrade> weightedGrade) {
        this.weightedGrade = weightedGrade;
    }

    public List<WeightedGrade> getWeightedGrade() {
        return weightedGrade;
    }

    public double calculateMultipleWeighted() {
        double result = 0.0;
        int totalCreditPoints = 0;
        for (WeightedGrade grade : getWeightedGrade()) {
            result += grade.getValue();
            totalCreditPoints += grade.getCreditPoints();
        }
        return result / totalCreditPoints;
    }
}
