package ch17.stream_element_processing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipelineExample {
    public static void main(String[] args) {
        List<StreamPipelineStudent> list = Arrays.asList(
                new StreamPipelineStudent("홍길동", 10),
                new StreamPipelineStudent("김길동", 20),
                new StreamPipelineStudent("이길동", 30)
        );


        // 방법 2
        /*
        // 방법 1
        Stream<StreamPipelineStudent> studentStream = list.stream();
        // 충간 처리(학생 객체를 점수로 맵핑)
        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
        // 최종 처리(평균 점수)
        double avg = scoreStream.average().getAsDouble();
        System.out.println("평균 점수 : " + avg);
        // 출력 --------------------------------------------------
        // 평균 점수 : 20.0
        */
        double avg = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();
        System.out.println("평균 점수 : " + avg);
        // 출력 --------------------------------------------------
        // 평균 점수 : 20.0

    }
}
