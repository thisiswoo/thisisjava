package ch09.nested_declaration_and_anonymous_objects;

public class AnonymousChildExample {
    public static void main(String[] args) {
        // Parents 객체생성
        AnonymousParents parents = new AnonymousParents();

        // 익명 자식 객체가 대입된 필드 사용
        parents.shouts();

        // 익명 자식 객체가 대입된 로컬변수 사용
        parents.shouting();

        // 익명 자식 객체가 대입된 매개변수 사용
        parents.angry(new AnonymousChild() {
            @Override
            public void response() {
                System.out.println("익명 자식 객체 알았다고~~~");
            }
        });
    }
}
