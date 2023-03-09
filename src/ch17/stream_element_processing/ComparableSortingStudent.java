package ch17.stream_element_processing;

public class ComparableSortingStudent implements Comparable<ComparableSortingStudent> {
    private String name;
    private int score;

    public ComparableSortingStudent(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(ComparableSortingStudent o) {
        // score와 o.score가 같을 경우 0을 리턴
        // 작을 경우 음수 리턴
        // 클경우 양수 리턴
        return Integer.compare(score, o.score);
    }
}
