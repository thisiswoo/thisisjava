package ch17.stream_element_processing;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<ReduceStudent> studentList = Arrays.asList(
                new ReduceStudent("홍길동", 92),
                new ReduceStudent("김길동", 82),
                new ReduceStudent("홍길동", 89)
        );

        // 방법1
        int sum1 = studentList.stream()
                // ReduceStudent의 getScore() 메서드 참조
                .mapToInt(ReduceStudent::getScore)
                .sum();

        // 방법2
        int sum2 = studentList.stream()
                // ReduceStudent의 getScore() 메서드 참조
                .map(ReduceStudent::getScore)
                .reduce(0, (a, b) -> a + b);

        System.out.println("sum1 : " + sum1);
        System.out.println("sum2 : " + sum2);

        // 출력 -------------------------------------------
        // sum1 : 263
        // sum2 : 263
    }

}
