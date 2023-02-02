package ch12.module;

public class WrapperClassExample {
    public static void main(String[] args) {
        // Boxing
        Integer boxing = 100;
        // intValue() 메서드는 Integer 객체 내부의 int 값을 리턴한다.
        System.out.println("boxing value : " + boxing.intValue());

        // UnBoxing
        int unBoxing = boxing;
        System.out.println("unBoxing value : " + unBoxing);

        // 연산 시 UnBoxing
        int result = boxing + 100;
        System.out.println("result : " + result);

        System.out.println();

        // ---------------------------------------------------------
        // wrapper 객체에 정확히 어떤 값이 저장될 지 모르는 상황이라면
        // ==과 !=는 사용하지 않는 것이 좋다.
        // 대신 equals() 메서드로 내부 값을 비교할 수 있다.
        // wrapper 클래스의 equals() 매서드는 내부의 값을 비교하도록 재정의되어 있다.

        // -128~127 초과값일 경우
        Integer overInt1 = 300;
        Integer overInt2 = 300;
        System.out.println("over == " + (overInt1 == overInt2));  // 좋은 방법은 아님.
        System.out.println("over equals " + (overInt1.equals(overInt2)));  // 권장 방법
        System.out.println();

        // -128~127 범위 내 값일 경우
        Integer within1 = 10;
        Integer within2 = 10;
        System.out.println("within == " + (within1 == within2));  // 좋은 방법은 아님.
        System.out.println("within equals " + (within1.equals(within2)));  // 권장 방법
    }
}
