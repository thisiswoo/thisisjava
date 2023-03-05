package ch16.lambda_expressions;

public class ReturnLambdaExample {
    public static void main(String[] args) {
        ReturnLambdaPerson person = new ReturnLambdaPerson();

        // 실행문이 두 개 이상일 경우
        person.action((x, y) -> {
            double result = x + y;
            return result;
        });

        // 리턴문이 하나만 있을 경우(연산자)
        person.action((x, y) -> (x + y));

        // 리턴문이 하나만 있을 경우(메서드 호출)
        person.action((x, y) -> sum(x, y));
    }

    public static double sum(double x, double y) {
        return (x + y);
    }

    // 출력 ----------------------------------------
    // return 결과 : 14.0
    // return 결과 : 14.0
    // return 결과 : 14.0

}
