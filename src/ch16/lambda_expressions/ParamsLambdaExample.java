package ch16.lambda_expressions;

public class ParamsLambdaExample {
    public static void main(String[] args) {
        ParamsLambdaPerson person = new ParamsLambdaPerson();

        // 매개변수가 두 개일 경우 실행문이 두 개 이상일 경우
        person.action1((name, job) -> {
            System.out.print(name + "이 ");
            System.out.println(job + "을 합니다.");
        });
        // 매개변수가 두 개일 경우 실행문이 한 개일 경우
        person.action1((name, job) -> System.out.println(name + "이 " + job + "을 하지 않습니다."));

        // 매개변수가 한 개일 경우 실햄문이 두 개 이상일 경우
        person.action2(word -> {
            System.out.print("\"" + word + "\"");
            System.out.println("라고 말합니다");
        });
        // 매개변수가 한 개일 경우 실햄문이 한 개일 경우
        person.action2(word -> System.out.println("\"" + word + "\"라고 외칩니다"));

        // 출력 ----------------------------------------------------------
        // 홍길동이 프로그래밍을 합니다.
        // 홍길동이 프로그래밍을 하지 않습니다.
        // "hello world~~~~"라고 말합니다
        // "hello world~~~~"라고 외칩니다

    }
}
