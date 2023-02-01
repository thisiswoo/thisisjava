package ch09.nested_declaration_and_anonymous_objects;

public class LocalClass {
    // local 메서드
    public void localMethod(int finalArg) {  // final int arg
        // local 변수
        int localVar = 1;

        // local class
        class NestedLocalClass {
            // 메서드
            void nestedLocalMethod() {
                // 로컬 변수 확인
                System.out.println("finalArg : " + finalArg);
                System.out.println("localVar : " + localVar);

                // local 변수 수정 불가
                // local class에서는 final 특성을 가지기 때문에 '읽기 가능', '수정 불가'
                // finalArg = 2;
                // localVar = 2;
            }
        }

        // 로컬 객체생성
        NestedLocalClass nlc = new NestedLocalClass();
        // 로컬 객체 메서드 호출
        nlc.nestedLocalMethod();

        // 로컬 변수 수정 불가
        // local class에서는 final 특성을 가지기 때문에 '읽기 가능', '수정 불가'
        // finalArg = 3;
        // localVar = 3;
    }
}
