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
}
