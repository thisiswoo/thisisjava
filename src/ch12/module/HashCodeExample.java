package ch12.module;

public class HashCodeExample {

    public static void main(String[] args) {
        HashCodeStudent s1 = new HashCodeStudent(1, "홍길동");
        HashCodeStudent s2 = new HashCodeStudent(1, "김길동");

        if (s1.hashCode() == s2.hashCode()) {
            if (s1.equals(s2)) {
                System.out.println("s1.equals(s2)은 동등한 객체입니다." );
            } else {
                System.out.println("데이터가 다르므로 동등한 객체가 아닙니다.");
            }
        } else {
            System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
        }
    }
}
