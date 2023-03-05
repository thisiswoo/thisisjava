package ch16.lambda_expressions;

public class MethodReferencePerson {
    public void action(MethodReferenceCalcuable calcuable) {
        double result = calcuable.calc(10, 4);
        System.out.println("결과 : " + result);
    }
}
