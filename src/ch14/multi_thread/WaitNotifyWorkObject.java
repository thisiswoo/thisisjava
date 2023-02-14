package ch14.multi_thread;

public class WaitNotifyWorkObject {
    // 동기화 메서드
    public synchronized void methodA() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ": methodA 작업 실행");
        notify();   // 다른 스레드를 실행 대기 상태로 만듦
        try {
            wait(); // 자신의 스레드는 일시 정지 상태로 만듦
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    // 동기화 메서드
    public synchronized void methodB() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ": methodB 작업 실행");
        notify();   // 다른 스레드를 실행 대기 상태로 만듦
        try {
            wait(); // 자신의 스레드는 일시 정지 상태로 만듦
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
