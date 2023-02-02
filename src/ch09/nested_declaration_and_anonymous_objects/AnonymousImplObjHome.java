package ch09.nested_declaration_and_anonymous_objects;

public class AnonymousImplObjHome {
    // 필드에 익명 구현 객체 대입
    private AnonymousImplObjRemoteCntrl rc = new AnonymousImplObjRemoteCntrl() {
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");
        }
    };

    // 메서드(필드 이용)
    public void useField() {
        rc.turnOn();
        rc.turnOff();
    }

    // 메서드(로컬 변수 이용)
    public void useLocal() {
        // 로컬 변수에 익명 구현 객체 대입
        AnonymousImplObjRemoteCntrl rc = new AnonymousImplObjRemoteCntrl() {
            @Override
            public void turnOn() {
                System.out.println("에어컨을 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨을 끕니다.");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    // 메서드(매개변수 이용)
    public void useParameters(AnonymousImplObjRemoteCntrl rc) {
        rc.turnOn();
        rc.turnOff();
    }
}
