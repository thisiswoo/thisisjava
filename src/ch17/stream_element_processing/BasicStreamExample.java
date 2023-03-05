package ch17.stream_element_processing;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class BasicStreamExample {
    public static void main(String[] args) {
        // Set 컬렉션 생성
        Set<String> set = new HashSet<>();
        set.add("자바");
        set.add("스프링");
        set.add("JPA");
        set.add("홍길동");
        set.add("김길동");
        set.add("이길동");

        // Stream을 이용한 요소 반복 처리
        Stream<String> stream = set.stream();   // 스트림
        stream.forEach( name -> System.out.println(name) ); // 람다식으로 요처 처리

        // 출력 -------------------------------------------------
        // Set 컬렉션은 저장 순서가 유지되지 않아 아래와 같이 무작위로 출력된다.
        // 스프링
        // JPA
        // 자바
    }
}
