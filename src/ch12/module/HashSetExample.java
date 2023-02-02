package ch12.module;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet hs = new HashSet();

        HashCodeStudent s1 = new HashCodeStudent(1, "홍길동");
        hs.add(s1);
        System.out.println("저장된 객체 수 : " + hs.size());

        HashCodeStudent s2 = new HashCodeStudent(1, "홍길동");
        hs.add(s2);
        System.out.println("저장된 객체 수 : " + hs.size());

        HashCodeStudent s3 = new HashCodeStudent(2, "홍길동");
        hs.add(s3);
        System.out.println("저장된 객체 수 : " + hs.size());

        // HashCodeStudent 파일에서 @Override 한 Object의 equals() 메서드를
        // 주석을 풀게 되면
        // 객체 번지로 해시코드를 생성하므로 객체가 다를 경우 해시코드도 달라진다.
    }
}
