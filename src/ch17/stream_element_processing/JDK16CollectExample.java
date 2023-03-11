package ch17.stream_element_processing;

import ch14.multi_thread.SumThread;
import ch14.multi_thread.SyncUser2Thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JDK16CollectExample {
    public static void main(String[] args) {
        List<JDK16CollectStudent> totalList = new ArrayList<>();
        totalList.add(new JDK16CollectStudent("홍길동", "남", 92));
        totalList.add(new JDK16CollectStudent("오해영", "녀", 99));
        totalList.add(new JDK16CollectStudent("김길동", "남", 82));
        totalList.add(new JDK16CollectStudent("육해영", "녀", 81));

        // 남학생만 묶어 List 생성
        // 방법 1
//        List<JDK16CollectStudent> maleList = totalList.stream()
//                .filter(s -> s.getSex().equals("남"))
//                .collect(Collectors.toList());

        // 방법 2
        List<JDK16CollectStudent> maleList = totalList.stream()
                .filter(s -> s.getSex().equals("남"))
                .toList();

        maleList.stream()
                .forEach(s -> System.out.println(s.getName()));

        System.out.println();

        // 학생 이름을 키, Student 객체를 값으로 갖는 Map 생성
        Map<String, Integer> map = totalList.stream()
                .collect(
                        Collectors.toMap(
                                s -> s.getName(),   // Student 객체에서 키가 될 부분 리턴
                                s -> s.getScore()   // Student 객체에서 값이 될 부분 리턴
                        )
                );

        System.out.println(map);

        // 출력 --------------------------------------------
        // 홍길동
        // 김길동

        // {김길동=82, 오해영=99, 홍길동=92, 육해영=81}
    }
}
