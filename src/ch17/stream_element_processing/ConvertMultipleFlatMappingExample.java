package ch17.stream_element_processing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertMultipleFlatMappingExample {
    public static void main(String[] args) {
        // 문장 스트림을 단어 스트림으로 변환
        List<String> list1 = new ArrayList<>();
        list1.add("this is java");
        list1.add("i am a best developer");
        list1.stream()  // 2개의 요소가 stream()에 들어옴 ("this is java"와 "i am a best developer")
                .flatMap(data -> Arrays.stream(data.split(" ")))    // Arrays.stream() 메서드는 주어진 String[] 배열을 Stream<String>으로 만듦
                .forEach(word -> System.out.println(word));

        System.out.println();

        // 무자열 숫자 목록 스트림을 숫자 스트림으로 변환
        List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
        list2.stream()  // 2개의 요소가 stream()에 들어옴 ("10, 20, 30"와 "40, 50")
                // String[] 배열을 int[] 배열로 만듦
                .flatMapToInt(data -> {
                    String[] strArr = data.split(",");
                    int[] intArr = new int[strArr.length];
                    for (int i = 0; i < strArr.length; i++) {
                        intArr[i] = Integer.parseInt(strArr[i].trim()); // 위 2개 요소를 String[] 배열에서 공백을 없에주고 Int[] 배열로 만듦
                    }
                    return Arrays.stream(intArr);
                })
                // Arrays.stream() 메서드는 주어진 int[] 배열을 intStream으로 만듦
                .forEach(number -> System.out.println(number));

        // 출력 --------------------------------------------------------
        // this
        // is
        // java
        // i
        // am
        // a
        // best
        // developer

        // 10
        // 20
        // 30
        // 40
        // 50
    }
}
