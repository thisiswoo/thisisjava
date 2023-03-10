package ch15.collection_framwork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 컬렉션 생성
        Set<String> set = new HashSet<String>();

        // 객체 저장
        set.add("Java");
        set.add("Spring");
        set.add("Spring Boot");
        set.add("JPA");
        set.add("Spring Boot"); // 중복 객체이므로 저장하지 않음

        // 저장된 객체 수 출력
        int size = set.size();
        System.out.println("set 총 객체 수 : " + size);

        // 출력 ------------------------------------
        // set 총 객체 수 : 4

        // HashSetMember -------------------------
        // HashSetMember HashSet 컬렉션 생성
        Set<HashSetMember> memberHashSet = new HashSet<HashSetMember>();

        // HashSetMember 객체 저장
        // 인스턴스는 다르지만 동등 객체이므로 객체 1개만 저장
        memberHashSet.add(new HashSetMember("홍길동", 30));
        memberHashSet.add(new HashSetMember("홍길동", 30));

        // 저장된 객체 수 출력
        System.out.println("HashSetMember 총 객체 수 : " + memberHashSet.size());
        System.out.println();

        // 출력 ------------------------------------
        // HashSetMember 총 객체 수 : 1

        // HashSetMember 반복문 ---------------------
        // String HashSet 컬렉션 생성
        Set<String> whileSet = new HashSet<String>();

        // 객체 추가
        whileSet.add("Java");
        whileSet.add("Spring");
        whileSet.add("JDBC");
        whileSet.add("JPA");

        // 객체를 하나씩 가져와서 처리
        Iterator<String> iterator = whileSet.iterator();
        while (iterator.hasNext()) {
            // 객체를 하나 가져오기
            String element = iterator.next();
            System.out.println("while() element : " + element);
            if (element.equals("Spring")) {
                // 가져온 객체를 컬렉션에서 제거
                // for 문을 사용하지 않는 이유는 반복할 횟수를 인식하고 작동하게 되는데,
                // for 문 작동 중에 만약 반복하는 갯수의 값을 제거하게 되면 오류가 발생하게 된다.
                iterator.remove();
            }
        }
        System.out.println();

        // 객체 제거
        whileSet.remove("JDBC");

        // 객체를 하나씩 가져와서 처리
        // for 문을 사용하지 않는 이유는 반복할 횟수를 인식하고 작동하게 되는데,
        // for 문 작동 중에 만약 반복하는 갯수의 값을 제거하게 되면 오류가 발생하게 된다.
        for (String element : whileSet) {
            System.out.println("객체를 하나씩 가져와서 처리 element : " + element);
            // 에러 예제
            if (element.equals("Java")) {
                whileSet.remove(element);
                // exception 발생
                // Exception in thread "main" java.util.ConcurrentModificationException
                // at java.base/java.util.HashMap$HashIterator.nextNode(HashMap.java:1597)
                // at java.base/java.util.HashMap$KeyIterator.next(HashMap.java:1620)
                // at ch15.collection_framwork.HashSetExample.main(HashSetExample.java:73)
            }
        }

        // 출력 ------------------------------------
        // while() element : Java
        // while() element : JDBC
        // while() element : JPA
        // while() element : Spring

        // 객체를 하나씩 가져와서 처리 element : Java
        // 객체를 하나씩 가져와서 처리 element : JPA
    }
}
