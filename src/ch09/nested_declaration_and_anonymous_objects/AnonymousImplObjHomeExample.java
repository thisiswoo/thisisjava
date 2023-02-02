package ch09.nested_declaration_and_anonymous_objects;

public class AnonymousImplObjHomeExample {
    public static void main(String[] args) {
        // AnonymousImplObjHome 객체 생성
        AnonymousImplObjHome home = new AnonymousImplObjHome();

        // 익명 구현 객체가 대입된 필드 사용
        home.useField();

        // 익명 구현 객체가 대입된 로컬 변수 사용
        home.useLocal();

        // 익명 구현 객체가 대입된 매개변수 사용
        home.useParameters(new AnonymousImplObjRemoteCntrl() {
            @Override
            public void turnOn() {
                System.out.println("보일러를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("보일러를 끕니다.");
            }
        });
    }
}
