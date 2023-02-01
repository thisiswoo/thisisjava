package ch09.nested_declaration_and_anonymous_objects;

public class InstanceMemberClassExample {
    // instance 멤버 클래스
    class InstanceMember {
        // instance 필드
        int field1 = 1;

        // 정적 필드 JDK17+
        static int field2 = 2;

        // 생성자
        InstanceMember() {
            System.out.println("InstanceMember 생성자 실행");
        }

        // 인스턴스 메서드
        void instanceMethod1() {
            System.out.println("instanceMethod1 메서드 실행");
        }

        // 정적 메서드 JDK17+
        static void staticInstanceMethod() {
            System.out.println("staticInstanceMethod 메서드 실행");
        }
    }

    // 인슨턴스 메서드
    void instanceMethod2() {
        // InstanceMember 객체 생성 및 인스턴스 필드 및 메서드 사용
        InstanceMember im = new InstanceMember();
        System.out.println(im.field1);
        im.instanceMethod1();

        // InstanceMember 클래스의 정적 필드 및 메서드 사용 (JDK15+)
        System.out.println(InstanceMember.field2);
        InstanceMember.staticInstanceMethod();

    }
}
