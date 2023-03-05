package ch17.stream_element_processing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        // List 컬렉션 생성
        List<String> list = new ArrayList<>();
        list.add("자바");
        list.add("스프링");
        list.add("JPA");
        list.add("람다식");
        list.add("병렬처리");

        // 병렬처리
        Stream<String> parallelStream = list.parallelStream();  // 병렬 스트림 얻기
        parallelStream.forEach( name -> {   // 람다식 요소 처리
            System.out.println(name + ": " + Thread.currentThread().getName());
        });

        // 출력 ---------------------------------------------------
        // 자바: ForkJoinPool.commonPool-worker-3
        // 병렬처리: ForkJoinPool.commonPool-worker-2
        // 스프링: ForkJoinPool.commonPool-worker-1
        // 람다식: ForkJoinPool.commonPool-worker-4
        // JPA: main
    }
}
