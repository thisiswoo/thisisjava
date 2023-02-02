package ch12.module;

public record JDK14RecordDTO(String id, String name, int age) {
    // JDK14+ record 메서드는 자동으로
    // private final 필드와 생성자 및 Getter 메서드가 자동으로 추가 되고,
    // hashCode(), equals(), toString() 메서드를 재정의한 코드도 자동으로 추가된다.
}
