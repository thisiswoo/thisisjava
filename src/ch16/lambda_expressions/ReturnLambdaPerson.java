package ch16.lambda_expressions;

public class ReturnLambdaPerson {
    public void action(ReturnLambdaCalcuable calcuable) {
        double result = calcuable.calc(10, 4);
        System.out.println("return 결과 : " + result);
    }
}
