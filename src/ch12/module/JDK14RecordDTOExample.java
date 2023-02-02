package ch12.module;

public class JDK14RecordDTOExample {
    public static void main(String[] args) {
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
