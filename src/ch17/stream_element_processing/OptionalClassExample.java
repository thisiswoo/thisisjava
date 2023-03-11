package ch17.stream_element_processing;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalClassExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        /*
        NoSuchElementException 예외 발생
        double avg = list.stream()
                // Integer 클래스의 intValue() 메서드 참조
                .mapToInt(Integer :: intValue)
                .average()
                .getAsDouble();
        Exception in thread "main" java.util.NoSuchElementException: No value present
        at java.base/java.util.OptionalDouble.getAsDouble(OptionalDouble.java:130)
        at ch17.stream_element_processing.OptionalClassExample.main(OptionalClassExample.java:14)
        */

        // 방법 1
        OptionalDouble optional = list.stream()
                // Integer 클래스의 intValue() 메서드 참조
                .mapToInt(Integer :: intValue)
                .average();
        if (optional.isPresent()) {
            System.out.println("방법1 평균 : " + optional.getAsDouble());
        } else {
            System.out.println("방법1 평균 : 0.0");
        }

        // 방법 2
        double avg = list.stream()
                // Integer 클래스의 intValue() 메서드 참조
                .mapToInt(Integer :: intValue)
                .average()
                .orElse(0.0);
        System.out.println("방법2_평균 : " + avg);

        // 방법3
        list.stream()
                // Integer 클래스의 intValue() 메서드 참조
                .mapToInt(Integer :: intValue)
                .average()
                .ifPresent(a -> System.out.println("방법3_평균 : " + a));

        // 출력 --------------------------------------------
        // 방법1 평균 : 0.0
        // 방법2_평균 : 0.0
    }
}
