package ch09.nested_declaration_and_anonymous_objects;

public class StaticMemberClassExample {
    // 정적 멤버 클래스
    static class StaticMember {
        // 인스턴스 필드
        int field1 = 1;

        // 정적 필드 (JDK15+)
        static int field2 = 2;

        // 생성자
        StaticMember() {
            System.out.println("StaticMember 생성자 실행");
        }

        // 인스턴스 메서드
        void instanceMethod() {
            System.out.println("instanceMethod 생성자 실행");
        }

        // 정적 메서드 (JDK15+)
        static void staticMethod() {
            System.out.println("staticMethod 메서드 실행");
        }
    }
}
