package ch17.stream_element_processing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupCollectReturnMapExample {
    public static void main(String[] args) {
        List<JDK16CollectStudent> totalList = new ArrayList<>();
        totalList.add(new JDK16CollectStudent("Java", "남", 62));
        totalList.add(new JDK16CollectStudent("Spring", "녀", 80));
        totalList.add(new JDK16CollectStudent("JPA", "남", 95));
        totalList.add(new JDK16CollectStudent("Batch", "녀", 78));

        Map<String, Double> map = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                s -> s.getSex(),
                                Collectors.averagingDouble(s -> s.getScore())
                        )
                );
        System.out.println(map);

        // 출력 -----------------------------------------------
        // 남/녀를 기준으로 score의 평균값 출력
        // {녀=79.0, 남=78.5}
    }
}
