package ch14.multi_thread;

public class WaitNotifyThreadA extends Thread {
    public WaitNotifyWorkObject workObject;

    // 공유 작업 객체를 받음
    public WaitNotifyThreadA(WaitNotifyWorkObject workObject) {
        setName("ThreadA"); // 스레드 이름 변경
        this.workObject = workObject;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            workObject.methodA();   // 동기화 메서드 호출
        }
    }
}
