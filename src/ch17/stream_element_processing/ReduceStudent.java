package ch17.stream_element_processing;

public class ReduceStudent {
    private String name;
    private int score;

    public ReduceStudent(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
