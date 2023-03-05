package ch16.lambda_expressions;

public class AnonymousObjectsNoParamsLambdaExample {
    public static void main(String[] args) {
        // OK 버튼 객체 생성
        AnonymousObjectsNoParamsLambdaButton okBtn = new AnonymousObjectsNoParamsLambdaButton();

        // OK 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
        // 괄호 있는 람다식으로 표현
        okBtn.setClickListener(() -> {
            System.out.println("OK 버튼을 클릭~");
        });

        // OK 버튼 클릭
        okBtn.click();

        // Cancel 버틑 객체 생성
        AnonymousObjectsNoParamsLambdaButton cancelBtn = new AnonymousObjectsNoParamsLambdaButton();
        // Cancle 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
        // 괄로 생략한 람다식 표현
        cancelBtn.setClickListener(() -> System.out.println("Cancel 버튼을 클릭!"));

        // Cancel 버튼 클릭
        cancelBtn.click();

        // 출력 -----------------------------------------------------
        // OK 버튼을 클릭~
        // Cancel 버튼을 클릭!
    }
}
