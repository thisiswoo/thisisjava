package ch17.stream_element_processing;

import ch14.multi_thread.SumThread;
import ch14.multi_thread.SyncUser2Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupCollectReturnKeyExample {
    public static void main(String[] args) {
        List<JDK16CollectStudent> totalList = new ArrayList<>();
        totalList.add(new JDK16CollectStudent("홍길동", "남", 62));
        totalList.add(new JDK16CollectStudent("오해영", "녀", 80));
        totalList.add(new JDK16CollectStudent("김길동", "남", 95));
        totalList.add(new JDK16CollectStudent("육해영", "녀", 78));

        Map<String, List<JDK16CollectStudent>> map = totalList.stream()
                .collect(
                        Collectors.groupingBy(s -> s.getSex())  // 그룹핑 키 리턴
                );

        List<JDK16CollectStudent> maleList = map.get("남");
        maleList.stream().forEach(s -> System.out.println(s.getName()));

        System.out.println();

        List<JDK16CollectStudent> femaleList = map.get("녀");
        femaleList.stream().forEach(s -> System.out.println(s.getName()));

        // 출력 ---------------------------------------------------
        // 홍길동
        // 김길동

        // 오해영
        // 육해영
    }
}
