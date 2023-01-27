package ch06.oop_class;

public class StaticMamerExample {

    // 해당 class 내의 main 메서드에서 실행하기 위해 static 키워드 추가
    public static class Calculator {
        String color;   // instance field
        void setColor(String color) {   // instance method
            this.color = color;
        }   // instance method

        static double pi = 3.14159; // static field
        static int plus(int x, int y) { // static method
            return x + y;
        }   // static method

        static int minus(int x, int y) { // static method
            return x - y;
        }   // static method

        // static block
        static String company = "MyCompany";
        static String model = "LCD";
        static String info;

        static {
            info = company + "-" + model;
        }
    }

    // instance 사용불가
    public class ClassName {
        // 인스턴스 필드와 메소드 선언
        int field1;
        void method1() {}

        // 정적 필드와 메소드 선언
        static int field2;
        static void method2() {}

        // 정적 블록 선언
        static {
            // field1 = 0; // 컴파일 에러 : 정적 블록에서 인스턴스 변수 사용불가
            // method1(); // 컴파일 에러 : 정적 블록에서 인스턴스 메서드 사용불가
            field2 = 10;
            method2();
        }

        // 정적 메서드 선언
        static void Method3() {
            // this.field1 = 10; // 컴파일 에러 : 정적 메서드에서 인스턴스 변수 사용불가
            // this.method1(); // 컴파일 에러 : 정적 메서드에서 인스턴스 메서드 사용불가
            field2 = 10;
            method2();
        }
    }

    // 정적 메소드와 정적 블록에서 인스턴스 멤버를 사용하고 싶다면
    // 아래와 같이 객체를 먼저 생성하고 '참조 변수'로 접근 해야한다.
    void Method3() {
        // 객체생성
        ClassName obj = new ClassName();
        // 인스턴스 멤버 사용
        obj.field1 = 10;
        obj.method1();
    }

    public static void main(String[] args) {
        double calResult1 = 10 * 10 * Calculator.pi;
        System.out.println("Calculator instance vs static 1 : " + calResult1);

        int calResult2 = Calculator.plus(10, 20);
        System.out.println("Calculator instance vs static 2 : " + calResult2);

        int calResult3 = Calculator.minus(10, 5);
        System.out.println("Calculator instance vs static 3 : " + calResult3);

        System.out.println("Calculator instance vs static 4 : " + Calculator.info);
    }
}
