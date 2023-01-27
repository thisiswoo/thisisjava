package ch06.oop_class;

public class VariableLengthParameters {

    // 해당 class 내의 main 메서드에서 실행하기 위해 static 키워드 추가
//    public class Computer {
    public static class Computer {
        /*
        int[] values = { 1, 2, 3 };
        int result = sum(values);
        */

        // 위 코드를 refactoring
        int result = sum(new int[] { 1, 2, 3 });

        // 가변길이 매개변수를 갖는 메서드 선언
        int sum(int ... values) {
            // 변수 선언
            int sum = 0;

            // valuse는 배열 타입의 변수처럼 사용
            for (int items : values) {
                sum += items;
            }

            // 합산 결과를 return
            return sum;
        }
    }

    public static void main(String[] args) {

        // Computer 객체(class) 기본 생성사('Computer()') 생성
        Computer myCom = new Computer();

        // sum() 메서드 호출 시 매개값 1, 2, 3 제공하고
        // 합산 결과를 return 받아 result1 변수에 대입
        int result1 = myCom.sum(1, 2, 3);
        System.out.println("Computer result1 : " + result1);

        // sum() 메서드 호출 시 매개값 1, 2, 3, 4, 5 제공하고
        // 합산 결과를 return 받아 result2 변수에 대입
        int result2 = myCom.sum(1, 2, 3, 4, 5);
        System.out.println("Computer result2 : " + result2);

        // sum() 메서드 호출 시 매개값 배열을 제공하고
        // 합산 결과를 return 받아 result3 변수에 대입
        int[] values = { 1, 2, 3, 4, 5 };
        int result3 = myCom.sum(values);
        System.out.println("Computer result3 : " + result3);

        // sum() 메서드 호출 시 매개값 배열을 제공하고
        // 합산 결과를 return 받아 result4 변수에 대입
        int result4 = myCom.sum(new int[] { 1, 2, 3, 4, 5 });
        System.out.println("Computer result4 : " + result4);

    }
}
