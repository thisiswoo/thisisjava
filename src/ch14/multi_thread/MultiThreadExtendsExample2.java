package ch14.multi_thread;

public class MultiThreadExtendsExample2 extends Thread {
    public void run() {
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
