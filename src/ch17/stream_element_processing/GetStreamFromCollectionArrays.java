package ch17.stream_element_processing;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GetStreamFromCollectionArrays {
    public static void main(String[] args) {
        String[] strArray = {"홍길동", "김길동", "이길동"};
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(item -> System.out.print(item + ","));
        System.out.println();

        int[] intArray = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(item -> System.out.print(item + ","));
        System.out.println();

        // 출력 ----------------------------------------------------
        // 홍길동,김길동,이길동,
        // 1,2,3,4,5,
    }
}
