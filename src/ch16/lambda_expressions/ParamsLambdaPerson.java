package ch16.lambda_expressions;

public class ParamsLambdaPerson {
    public void action1(ParamsLambdaWorkable workable) {
        workable.work("홍길동", "프로그래밍");
    }

    public void action2(ParamsLambdaSpeakable speakable) {
        speakable.speak("hello world~~~~");
    }
}
