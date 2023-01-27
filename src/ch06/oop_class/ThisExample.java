package ch06.oop_class;

public class ThisExample {

    // 해당 class 내의 main 메서드에서 실행하기 위해 static 키워드 추가
//    public class Car {
    public static class Car {
        // 필드 선언
        String company = "르노삼성";
        String model;
        String color;
        int maxSpeed;

        // 생성자 선언
        Car() {}    // 생성자1

        Car(String model) {     // 생성자2
            this.model = model;
        }

        Car(String model, String color) {   // 생성자3
            this.model = model;
            this.color = color;
        }

        Car(String model, String color, int maxSpeed) { // 생성자4
            this.model = model;
            this.color = color;
            this.maxSpeed = maxSpeed;
        }
    }

    public static void main(String[] args) {

        // 생성자1 객체생성 후 호출
        Car car1 = new Car();
        System.out.println("car1.company : " + car1.company); // 현대자동차

        System.out.println("");

        // 생성자2 객체생성 후 호출
        Car car2 = new Car("QM6");
        System.out.println("car2.company : " + car2.company); // 현대자동차
        System.out.println("car2.model : " + car2.model); // 자가용

        System.out.println("");

        // 생성자3 객체생성 후 호출
        Car car3 = new Car("QM6", "쥐색");
        System.out.println("car3.company : " + car3.company); // 현대자동차
        System.out.println("car3.model : " + car3.model); // 자가용
        System.out.println("car3.color : " + car3.color); // 쥐색

        System.out.println("");

        // 생성자4 객체생성 후 호출
        Car car4 = new Car("QM6", "쥐색", 200);
        System.out.println("car4.company : " + car4.company); // 현대자동차
        System.out.println("car4.model : " + car4.model); // 자가용
        System.out.println("car4.color : " + car4.color); // 쥐색
        System.out.println("car4.maxSpeed : " + car4.maxSpeed); // 200
    }
}
