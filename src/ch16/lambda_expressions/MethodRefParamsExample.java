package ch16.lambda_expressions;

public class MethodRefParamsExample {
    public static void main(String[] args) {
        MethodRefParamsPerson person = new MethodRefParamsPerson();

        // 메서드 탐조
        person.ordering( String :: compareToIgnoreCase );

        // 출력 ---------------------------------
        // 홍길동은 김길동보다 뒤에 옵니다.
    }
}
