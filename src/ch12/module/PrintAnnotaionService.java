package ch12.module;

public class PrintAnnotaionService {
    @PrintAnnotaion
    public void method1() {
        System.out.println("실행 내용 1");
    }

    @PrintAnnotaion("*")
    public void method2() {
        System.out.println("실행 내용 2");
    }

    @PrintAnnotaion(value = "#", number = 20)
    public void method3() {
        System.out.println("실행 내용 3");
    }
}
