package ch06.oop_class;

public class ThisExample {

    // main() 메서드에서 바로 호출하기 위해 정적 메서드(static) 선언
//    public class Car {
    public static class Car {
        // 필드 선언
        String company = "르노삼성";
        String model;
        String color;
        int maxSpeed;

        // 생성자 선언
        /*Car() {}    // 생성자1
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
        }*/

        // 다른 생성자 호출
        // 생성자1
        Car(String model) {
            // 생성자3 호출
            this(model, "그레이", 250);
        }
        // 생성자2
        Car(String model, String color) {
            // 생성자3 호출
            this(model, color, 250);
        }
        // 생성자3
        Car(String model, String color, int maxSpeed) {
            this.model = model;
            this.color = color;
            this.maxSpeed = maxSpeed;
        }
    }

    public static void main(String[] args) {
        /*
        // 생성자1 객체생성 후 호출
        Car car1 = new Car();
        System.out.println("car1.company : " + car1.company); // 르노삼성

        System.out.println("");

        // 생성자2 객체생성 후 호출
        Car car2 = new Car("QM6");
        System.out.println("car2.company : " + car2.company); // 르노삼성
        System.out.println("car2.model : " + car2.model); // QM6

        System.out.println("");

        // 생성자3 객체생성 후 호출
        Car car3 = new Car("QM6", "그레이");
        System.out.println("car3.company : " + car3.company); // 르노삼성
        System.out.println("car3.model : " + car3.model); // QM6
        System.out.println("car3.color : " + car3.color); // 그레이

        System.out.println("");

        // 생성자4 객체생성 후 호출
        Car car4 = new Car("QM6", "그레이", 200);
        System.out.println("car4.company : " + car4.company); // 르노삼성
        System.out.println("car4.model : " + car4.model); // QM6
        System.out.println("car4.color : " + car4.color); // 그레이
        System.out.println("car4.maxSpeed : " + car4.maxSpeed); // 200
        */

        // 생성자1 객체생성 후 호출
        Car car1 = new Car("QM6");
        System.out.println("car1.company : " + car1.company); // 르노삼성
        System.out.println("car1.model : " + car1.model); // QM6

        System.out.println("");

        // 생성자2 객체생성 후 호출
        Car car2 = new Car("QM6", "그레이");
        System.out.println("car2.company : " + car2.company); // 르노삼성
        System.out.println("car2.model : " + car2.model); // QM6
        System.out.println("car2.color : " + car2.color); // 그레이

        System.out.println("");

        // 생성자3 객체생성 후 호출
        Car car3 = new Car("QM6", "그레이", 200);
        System.out.println("car3.company : " + car3.company); // 르노삼성
        System.out.println("car3.model : " + car3.model); // QM6
        System.out.println("car3.color : " + car3.color); // 그레이
        System.out.println("car3.maxSpeed : " + car3.maxSpeed); // 그레이

    }
}
