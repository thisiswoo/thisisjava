package ch17.stream_element_processing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingComparableExample {
    public static void main(String[] args) {
        // List 컬렉션 생성
        List<SortingComparableStudent> studentList = new ArrayList<>();
        studentList.add(new SortingComparableStudent("홍길동", 30));
        studentList.add(new SortingComparableStudent("김길동", 20));
        studentList.add(new SortingComparableStudent("이길동", 10));

        // 점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
        studentList.stream()
                .sorted()
                .forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));
        System.out.println();

        // 점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기.
        studentList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));

        // 출력 ----------------------------------------
        // 이길동 : 10
        // 김길동 : 20
        // 홍길동 : 30

        // 홍길동 : 30
        // 김길동 : 20
        // 이길동 : 10
    }
}
