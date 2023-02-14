package ch14.multi_thread;

public class WaitNotifyThreadB extends Thread {
    public WaitNotifyWorkObject workObject;

    // 공유 작업 객체를 받음
    public WaitNotifyThreadB(WaitNotifyWorkObject workObject) {
        setName("ThreadB"); // 스레드 이름 변경
        this.workObject = workObject;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            workObject.methodB();   // 동기화 메서드 호출
        }
    }
}
