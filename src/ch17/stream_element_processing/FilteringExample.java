package ch17.stream_element_processing;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        // List 컬렉션 생성
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("JPA");
        list.add("Java");
        list.add("JPA");
        list.add("OOP");
        list.add("TDD");
        list.add("Test Driven Development");

        // 중복 요소 제거
        list.stream()
                .distinct() // 중복제거
                .forEach(n -> System.out.println("중복요소 제거 : " + n));
        System.out.println();

        // J로 시작하는 요소만 필터링
        list.stream()
                .filter(n -> n.startsWith("J")) // String의 startsWith() 메서드는 주어진 문자열으로 시작하면 true, 아니면 false를 리턴
                .forEach(n -> System.out.println("J로 시작하는 요소만 필터 : " + n));
        System.out.println();

        // 중복 요소를 먼저 제거하고, T로 시작하는 요소만 필터링
        list.stream()
                .distinct() // 중복제거
                .filter(n -> n.startsWith("T")) // String의 startsWith() 메서드는 주어진 문자열으로 시작하면 true, 아니면 false를 리턴
                .forEach(n -> System.out.println("중복 요소를 먼저 제거하고, T로 시작하는 요소만 필터 : " + n));

        // 출력 ---------------------------------------------------------
        // 중복요소 제거 : Java
        // 중복요소 제거 : Spring
        // 중복요소 제거 : JPA
        // 중복요소 제거 : OOP
        // 중복요소 제거 : TDD
        // 중복요소 제거 : Test Driven Development

        // J로 시작하는 요소만 필터 : Java
        // J로 시작하는 요소만 필터 : JPA
        // J로 시작하는 요소만 필터 : Java
        // J로 시작하는 요소만 필터 : JPA

        // 중복 요소를 먼저 제거하고, T로 시작하는 요소만 필터 : TDD
        // 중복 요소를 먼저 제거하고, T로 시작하는 요소만 필터 : Test Driven Development

    }
}
