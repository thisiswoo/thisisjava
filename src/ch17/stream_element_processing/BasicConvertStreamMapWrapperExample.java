package ch17.stream_element_processing;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BasicConvertStreamMapWrapperExample {
    public static void main(String[] args) {
        int[] intArr = { 1, 2, 3, 4, 5 };

        // Stream의 경우 최종처리 하고 나서는 재사용이 안된다.
        // 재사용을 원하면 새로 만들어 사용해야 한다.
        IntStream intStream = Arrays.stream(intArr);    // original stream
        intStream
                .asDoubleStream()   // double 타입으로 변경
                .forEach(d -> System.out.print(d + " "));

        System.out.println();

        intStream = Arrays.stream(intArr);  // original stream
        intStream
                .boxed()    // int -> Integer, long -> Long, double -> Double로 변환하는게 boxed() 메서드 이다.
//                .forEach(obj -> System.out.print(obj.intValue() + " "));
                .forEach(obj -> System.out.print(obj + " "));

        // 출력 -----------------------------------------------------
        // 1.0 2.0 3.0 4.0 5.0
        // 1 2 3 4 5

    }
}
