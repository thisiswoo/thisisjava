package ch17.stream_element_processing;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArr = { 1, 2, 3, 4, 5 };

        // 잘목 작성한 경우
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(n -> System.out.println(n));  // 중간 처리,  최종 처리가 없으므로 동작하지 않음.

        // 중간 처리 메서드 peek()을 이용해서 반복 처리
        int total = Arrays.stream(intArr)
                .filter(a -> a % 2 ==0)
                .peek(n -> System.out.println("중간 처리 후 최종처리 : " + n))   // 중간 처리
                .sum(); // 최종처리
        System.out.println("총합 : " + total + "\n");

        // 최종 처리 메서드 forEach()를 이용해서 반복 처리
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .forEach(n -> System.out.println("최종 처리만 : " + n));   // 최종 처리이므로 동작

        // 출력 ----------------------------------------------------
        // 중간 처리 후 최종처리 : 2
        // 중간 처리 후 최종처리 : 4
        // 총합 : 6

        // 최종 처리만 : 2
        // 최종 처리만 : 4
    }
}
