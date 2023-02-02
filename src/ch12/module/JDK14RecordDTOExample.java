package ch12.module;

public class JDK14RecordDTOExample {
    public static void main(String[] args) {
        // JDK14+ record 메서드는 자동으로
        // private final 필드와 생성자 및 Getter 메서드가 자동으로 추가 되고,
        // hashCode(), equals(), toString() 메서드를 재정의한 코드도 자동으로 추가된다.

        JDK14RecordDTO r = new JDK14RecordDTO("winter", "눈송이", 25);
        System.out.println(r.id());
        System.out.println(r.name());
        System.out.println(r.age());
        System.out.println(r.toString());

        System.out.println();

        JDK14RecordDTO r1 = new JDK14RecordDTO("winter", "눈송이", 25);
        JDK14RecordDTO r2 = new JDK14RecordDTO("winter", "눈송이", 25);
        System.out.println("r1.hashCode() : " + r1.hashCode());
        System.out.println("r2.hashCode() : " + r2.hashCode());
        System.out.println("r1.equals(r2) : " + r1.equals(r2));
    }
}
