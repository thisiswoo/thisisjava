package ch17.stream_element_processing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class DifferenceBetweenConcurrencyAndParallelismExample {
    public static void main(String[] args) {
        Random random = new Random();

        // 1억 개의 Integer 객체 저장
        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            scores.add(random.nextInt(101));
        }

        double avg = 0.0;
        long startTime = 0;
        long endTime = 0;
        long time = 0;

        // 일반 스트림으로 처리
        Stream<Integer> stream = scores.stream();
        startTime = System.nanoTime();
        avg = stream
                .mapToInt(i -> i.intValue())
                .average()
                .getAsDouble();
        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println("avg : " + avg + ", 일반 스트림 처리 시간 : " + time + "ns");

        // 병렬 스트림으로 처리
        Stream<Integer> parallelStream = scores.parallelStream();
        startTime = System.nanoTime();
        avg = parallelStream
                .mapToInt(i -> i.intValue())
                .average()
                .getAsDouble();
        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println("avg : " + avg + ", 병렬 스트림 처리 시간 : " + time + "ns");

        // 출력 -------------------------------------------------------
        // 첫 번째 실행 결과
        // avg : 49.99879479, 일반 스트림 처리 시간 : 72149833ns
        // avg : 49.99879479, 병렬 스트림 처리 시간 : 35842833ns

        // 두 번째 실행 결과
        // avg : 50.00106539, 일반 스트림 처리 시간 : 73553416ns
        // avg : 50.00106539, 병렬 스트림 처리 시간 : 26339750ns

        // 세 번째 실행 결과
        // avg : 49.99799293, 일반 스트림 처리 시간 : 72259459ns
        // avg : 49.99799293, 병렬 스트림 처리 시간 : 30919375ns
    }
}
