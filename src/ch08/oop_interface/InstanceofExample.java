package ch08.oop_interface;

public class InstanceofExample {
    public static void main(String[] args) {
        // 구현 객체 생성
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        // ride() 메서드 호출 시 구현 객체를 매개값으로 전달
        ride(taxi);
        System.out.println();
        ride(bus);
    }

    // 인터페이스 매개변수를 갖는 메서드
    public static void ride(Vehicle vehicle) {
        // 방법 1
        /*if (vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;
            bus.checkFare();
        }*/

        // 방법2(JDK12+) 위 방법1 코드 간략하게
        if (vehicle instanceof Bus bus) {
            bus.checkFare();
        }

        vehicle.run();
    }


}
