package ch16.lambda_expressions;

public class AnonymousObjectsNoParamsLambdaButton {
    // 정적 멤버 인터페이스
    @FunctionalInterface
    public static interface ClickListener { // 함수형 인터페이스
        // 추상 메서드
        void onClick();
    }

    // 필드
    private ClickListener clickListener;

    // 메서드

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }
}
