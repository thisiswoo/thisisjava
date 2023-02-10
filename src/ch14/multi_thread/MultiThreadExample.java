package ch14.multi_thread;

import java.awt.*;

public class MultiThreadExample {
    public static void main(String[] args) {
        // 멀티스레드는 메인메서드가 작업 2를 실행하게 되는데
        // 이때 thread.start(); 가 호출이 되어
        // 새로운 스레드를 객체생성 후 재정의된 run() 메서드를 실행하게 된다.
        // 결과는 소리와 출력이 같이 진행하게 된다.

        // 작업 1 - 소리
        // 직접 객체생성 후 매개값으로 Runnable 인터페이스를 주고 작업하는 방식
        // 즉, 익명 구현 객체 방식
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);  // 0.5초 스레드 sleep
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();

        // 작업 2 - 출력 (main 스레드가 실행되는 부분)
        /*for (int i = 0; i < 5; i++) {
            System.out.println("띵~~~~~~~~~");
            try {
                Thread.sleep(500);  // 0.5초 스레드 sleep
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
        // 위 주석코드를 MultiThreadImplRunnable.java 에서 정의한 class 불러와서 실행시키기
        // 방법 1
        Thread thread2 = new Thread(new MultiThreadImplRunnable());
        thread2.start();
        // 방법 2
        MultiThreadImplRunnable mtir = new MultiThreadImplRunnable();
        Thread thread3 = new Thread(mtir);
        thread3.start();
        // 방법 3
        Runnable r = new MultiThreadImplRunnable();
        Thread thread4 = new Thread(r);
        thread4.start();

        // MultiThreadExtendsExample2를 상속받아 사용하기
        // 방법 1
        MultiThreadExtendsExample2 pt = new MultiThreadExtendsExample2();
        pt.start();
        // 방법 2 - 자식 객체는 부모 타입에 대입 될 수 있기 때문에 가능
        Thread t = new MultiThreadExtendsExample2();
        t.start();
    }
}
