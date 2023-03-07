package ch17.stream_element_processing;

import java.util.ArrayList;
import java.util.List;

public class BasicConvertScoreStreamMapExample {
    public static void main(String[] args) {
        // List 컬렉션 생성
        List<BasicConvertScoreStreamStudent> studentList = new ArrayList<>();
        studentList.add(new BasicConvertScoreStreamStudent("홍길동", 78));
        studentList.add(new BasicConvertScoreStreamStudent("김길동", 98));
        studentList.add(new BasicConvertScoreStreamStudent("이길동", 82));

        // BasicConvertScoreStreamStudent 객체를 score 스트림으로 변환
        studentList.stream()
                .mapToInt(s -> s.getScore()) // 객체(String name, int score)를 int로 변환
                .forEach(score -> System.out.println(score));

        // 출력 -------------------------------------------
        // 78
        // 98
        // 82
    }
}
