package ch16.lambda_expressions;

@FunctionalInterface // compiler가 compile 단계에서 해당 인터페이스의 추상 메서드에 정말 하나가 있는지 check를 해준다.
public interface MethodRefParamsComparable {
    int compare(String a, String b);
}
