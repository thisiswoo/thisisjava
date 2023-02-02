package ch11.exception;

public class TryWithResourceExample {
    public static void main(String[] args) {
        // try 예제 및 간소화 예제1
        try (MyResource res = new MyResource("A")) {
                String data = res.read1();
                int value = Integer.parseInt(data);
                System.out.println("return read1() : " + value);
        } catch (Exception e) {
            System.out.println("예외처리 : " + e.getMessage());
        }

        System.out.println();

        // try 예제 및 간소화 예제2
        try (MyResource res = new MyResource("A")) {
            String data = res.read2();
            // NullPointExceptino 발생
            int value = Integer.parseInt(data);
                System.out.println("return read1(2 : " + value);
        } catch (Exception e) {
            System.out.println("예외처리 : " + e.getMessage());
        }

        System.out.println();

        // try 예제 및 간소화 예제3
        MyResource res1 = new MyResource("A");
        MyResource res2 = new MyResource("B");
        try (res1; res2) {
            String data1 = res1.read1();
            String data2 = res2.read2();
            System.out.println("return read3() data1 : " + data1);
            System.out.println("return read3() data2 : " + data2);
        } catch (Exception e) {
            System.out.println("예외처리 : " + e.getMessage());
        }
    }
}
