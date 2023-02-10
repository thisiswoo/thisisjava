package ch14.multi_thread;

import java.awt.*;

public class SingleThreadExample {
    public static void main(String[] args) {
        // 작업 1 시스템에서 소리가 다 나면 다음 console에 찍힌다.
        // main 스레드는 하나에 하나 작업 밖에 하지 못해서 작업 1일 끝나면 작업 2를 실행하게 된다.
        // 작업 1 - 소리
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);  // 0.5초 스레드 sleep
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 작업 2 - 출력
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
