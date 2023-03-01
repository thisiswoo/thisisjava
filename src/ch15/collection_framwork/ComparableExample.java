package ch15.collection_framwork;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        // TreeSet 컬렉션 생성
        TreeSet<ComparablePerson> treeSet = new TreeSet<ComparablePerson>();

        // 객체 저장
        treeSet.add(new ComparablePerson("홍길동", 45));
        treeSet.add(new ComparablePerson("이자바", 35));
        treeSet.add(new ComparablePerson("김지원", 31));

        // 객체를 하나씩 가져오기
        for (ComparablePerson person : treeSet) {
            System.out.println(person.name + " : " + person.age);
        }

        // 출력 ----------------------------------------------
        // 홍길동 : 45
        // 이자바 : 35
        // 김지원 : 31
    }
}
