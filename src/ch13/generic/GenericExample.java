package ch13.generic;

public class GenericExample {
    public static void main(String[] args) {
        // GenericBox를 생성할 때 타입 파라미터 T 대신
        // 사용할 타입 String으로 대체하여 사용
        GenericBox<String> box1 = new GenericBox<>();
        box1.content = "hello";
        String str = box1.content;
        System.out.println(str);

        // GenericBox를 생성할 때 타입 파라미터 T 대신
        // 사용할 타입 Integer로 대체하여 사용
        GenericBox<Integer> box2 = new GenericBox<>();
        box2.content = 100;
        int value = box2.content;
        System.out.println(value);

        System.out.println();

        // Generic Product ---------------------------------
        // K는 Tv로 대체, M은 String으로 대체
        GenericProduct<GenericTv, String> product1 = new GenericProduct<>();

        // Setter 매개값은 반드기 Tv와 String을 제공
        product1.setKind(new GenericTv());
        product1.setModel("Smart TV");

        // Getter 리턴값은 TV와 String이 됨
        GenericTv tv = product1.getKind();
        String tvModel = product1.getModel();

        // K는 Car로 대체, M은 String으로 대체
        GenericProduct<GenericCar, String> product2 = new GenericProduct<>();

        // Setter 매개값은 반드시 GenericCar와 String을 제공
        product2.setKind(new GenericCar());
        product2.setModel("QM6");

        // Getter 리턴값은 GenericCar와 String이 됨
        GenericCar car = product2.getKind();
        String carModel = product2.getModel();

        GenericHomeAgency ha = new GenericHomeAgency();
        GenericHome h = ha.rent();
        h.turnOnLight();

        GenericCarAgency ca = new GenericCarAgency();
        GenericCar c = ca.rent();
        c.run();

        System.out.println();

        GenericBox b3 = new GenericBox();
        b3.content = "100";

        GenericBox b4 = new GenericBox();
        b4.content = "100";

        GenericBox b5 = new GenericBox();
        b5.content = 100;

        boolean result1 = b3.compare(b4);
        System.out.println("result1 : " + result1); // true

        boolean result2 = b3.compare(b5);
        System.out.println("result2 : " + result2); // false

        System.out.println();

        // call Generic Method ---------------------------------
        GenericBox<Integer> b6 = boxing(100);
        int intValue = b6.getT();
        System.out.println(intValue);

        GenericBox<String> b7 = boxing("홍길동");
        String strValue = b7.getT();
        System.out.println(strValue);

    }

    // Generic Method ---------------------------------
    // 제네릭 메서드
    public static <T> GenericBox<T> boxing(T t) {
        GenericBox<T> box = new GenericBox<>();
        box.setT(t);
        return box;
    }

    // 제한된 타입 파라미터 ---------------------------------
    // 제한된 타입 파라미터를 갖는 제네릭 메서드
    /*public static <T extends Number> boolean compare(T t1, T t2) { // 타입 파라미터 T를 대체할 타입을 Number로 제한

    }*/
}
