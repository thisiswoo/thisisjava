package ch14.multi_thread;

public class WaitNotifyExample {
    public static void main(String[] args) {
        WaitNotifyWorkObject workObject = new WaitNotifyWorkObject(); // 공유 작업 객체 생성

        // 작업 스레드 생성 및 실행
        WaitNotifyThreadA threadA = new WaitNotifyThreadA(workObject);
        WaitNotifyThreadB threadB = new WaitNotifyThreadB(workObject);

        threadA.start();
        threadB.start();
    }
}
