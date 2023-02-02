package ch09.nested_declaration_and_anonymous_objects;

public class AnonymousParents {
    // 필드에 AnonymousChild 객체 대입
    private AnonymousChild brother = new AnonymousChild();

    // 필드에 익명 자식 객체 대입
    private AnonymousChild sister = new AnonymousChild() {
        @Override
        public void response() {
            System.out.println("엄마가 익명 자식 brother을 부릅니다.");
        }
    };

    // 메서드 (필드 이용)
    public void shouts() {
        brother.response();
        sister.response();
    }

    // 메서드 (로컬 변수 이용)
    public void shouting() {
        // 로컬 변수에 익명 자식 객체 대입
        AnonymousChild child = new AnonymousChild() {
            @Override
            public void response() {
                System.out.println("엄마가 익명 자식 sister를 부릅니다.");
            }
        };
        child.response();
    }

    // 메서드(매개변수 이용)
    public void angry(AnonymousChild ac) {
        ac.response();
    }
}
