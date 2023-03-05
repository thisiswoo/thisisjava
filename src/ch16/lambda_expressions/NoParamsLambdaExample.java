package ch16.lambda_expressions;

public class NoParamsLambdaExample {
    public static void main(String[] args) {
        NoParamsLambdaPerson person = new NoParamsLambdaPerson();

        // 실행문이 두 개 이상인 경우 중괄호 필요한 람다식
        person.action(() -> {
            System.out.println("실행문이 두 개 이상인 람다식 action : 출근을 합니다.");
            System.out.println("실행문이 두 개 이상인 람다식 action : 프로그래밍을 합니다.");
        });

        // 실행문이 한 개일 경우 중괄호 생략 가능
        person.action(() -> System.out.println("실행문이 한 개인 람다식 action : 퇴근을 하자~~~"));

        // 출력 -------------------------------------------------
        // 실행문이 두 개 이상인 람다식 action : 출근을 합니다.
        // 실행문이 두 개 이상인 람다식 action : 프로그래밍을 합니다.

        // 실행문이 한 개인 람다식 action : 퇴근을 하자~~~
    }
}
