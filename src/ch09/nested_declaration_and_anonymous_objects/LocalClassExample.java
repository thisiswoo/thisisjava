package ch09.nested_declaration_and_anonymous_objects;

public class LocalClassExample {
    public static void main(String[] args) {
        // LocalClass 객체 생성
        LocalClass lc = new LocalClass();

        // LocalClass 클래스의 localMethod 메서드 호출
        lc.localMethod(2);
    }
}
