package ch14.multi_thread;

import java.awt.*;

public class MultiThreadExtendsExample {
    public static void main(String[] args) {
        // 작업 1 - 소리
        // 익명 자식 객체 방식
        Thread thread = new Thread() {
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
        };
        thread.start();

        // 작업 2 - 출력 (main 스레드가 실행되는 부분)
        for (int i = 0; i < 5; i++) {
            System.out.println("띵~~~~~~~~~");
            try {
                Thread.sleep(500);  // 0.5초 스레드 sleep
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
