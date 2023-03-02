package ch16.lambda_expressions;

import ch14.multi_thread.SyncUser2Thread;

public class BasicLambdaExample {
    public static void main(String[] args) {
        // 아래 action()를 람다식으로 표현
        action((x, y) -> {
            int result = x + y;
            System.out.println("result : " + result);
        });

        // 출력 -------------------------------------
        // result : 14
    }

    public static void action(BasicLambdaCalculable calculable) {
        // 데이터
        int x = 10;
        int y = 4;
        calculable.calculate(x, y);
    }

}
