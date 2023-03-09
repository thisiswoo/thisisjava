package ch17.stream_element_processing;

import java.util.ArrayList;
import java.util.List;

public class SortingComparatorExample {
    public static void main(String[] args) {
        // List 컬렉션 생성
        List<SortingComparatorStudent> studentList = new ArrayList<>();
        studentList.add(new SortingComparatorStudent("홍길동", 30));
        studentList.add(new SortingComparatorStudent("김길동", 20));
        studentList.add(new SortingComparatorStudent("이길동", 10));

        // 점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
        studentList.stream()
                .sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))  // score를 기준으로 올림차순 정렬
                .forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));
        System.out.println();

        // 점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
        studentList.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))  // s1과 s2의 순서를 바꿔 내림차순으로 정렬
                .forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));

        // 출력 -----------------------------------------------------------
        // 이길동 : 10
        // 김길동 : 20
        // 홍길동 : 30

        // 홍길동 : 30
        // 김길동 : 20
        // 이길동 : 10
    }
}
