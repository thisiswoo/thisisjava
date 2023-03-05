package ch17.stream_element_processing;

public class StreamPipelineStudent {
    private String name;
    private int score;

    public StreamPipelineStudent(String name, int score) {
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
