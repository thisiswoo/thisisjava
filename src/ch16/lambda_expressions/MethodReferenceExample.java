package ch16.lambda_expressions;

public class MethodReferenceExample {
    public static void main(String[] args) {
        MethodReferencePerson person = new MethodReferencePerson();

        // 정적 메서드일 경우
        // 람다식
//        person.action((x, y) -> MethodReferenceComputer.staticMethod(x, y));
        // 메서드 참조
        person.action( MethodReferenceComputer :: staticMethod );

        // 인스턴스 메서드일 경우
        MethodReferenceComputer com = new MethodReferenceComputer();
        // 람다식
//        person.action((x, y) -> com.instanceMethod(x, y));
        // 메서드 참조
        person.action( com :: instanceMethod );

        // 출력 ----------------------------------------------
        // 결과 : 14.0
        // 결과 : 40.0
    }
}
