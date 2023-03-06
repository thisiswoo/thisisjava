package ch17.stream_element_processing;

import java.util.stream.IntStream;

public class GetStreamFromRangeOfNumbers {
    public static int sum;
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 100);
        intStream.forEach(a -> sum += a);
        System.out.println("총합 : " + sum);

        // 출력 ---------------------------------------------
        // 총합 : 5050
    }
}
