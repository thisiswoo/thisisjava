package ch09.nested_declaration_and_anonymous_objects;

public class StaticMemberClass {
    public static void main(String[] args) {
        // StaticMember 객체 생성 및 인스턴스 필드 및 메서드 실행
        StaticMemberClassExample.StaticMember sb = new StaticMemberClassExample.StaticMember();
        System.out.println(sb.field1);
        sb.instanceMethod();

        // StaticMember 클래스의 정적 필드 및 메서드 사용
        System.out.println(StaticMemberClassExample.StaticMember.field2);
        StaticMemberClassExample.StaticMember.staticMethod();
    }
}
