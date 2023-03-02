package ch16.lambda_expressions;

@FunctionalInterface
public interface BasicLambdaCalculable {
    // 추상 메서드는 무조건 1개여야 한다.
    void calculate(int x, int y);
}
