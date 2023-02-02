package ch09.nested_declaration_and_anonymous_objects;

public class AccessObjectOuterClass {
    public static void main(String[] args) {
        // AccessObjectOuterClassExample 객체 생성
        AccessObjectOuterClassExample aooc = new AccessObjectOuterClassExample();

        // AccessObjectOuterClassExample 메서드 호출
        aooc.useAccessObjectOuterClassMethod();
    }
}
