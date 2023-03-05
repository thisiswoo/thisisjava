package ch16.lambda_expressions;

public class MethodReferenceComputer {
    public static double staticMethod(double x, double y) {
        return x + y;
    }

    public double instanceMethod(double x, double y) {
        return x * y;
    }
}
