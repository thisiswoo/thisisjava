package ch17.stream_element_processing;

public class BasicConvertScoreStreamStudent {
    private String name;
    private int score;

    public BasicConvertScoreStreamStudent(String name, int score) {
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
