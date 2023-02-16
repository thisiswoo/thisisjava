package ch14.multi_thread;

public class DaemonExample {
    public static void main(String[] args) {
        DaemonAutoSafeThread thread = new DaemonAutoSafeThread();
        thread.setDaemon(true); // DaemonAutoSafeThread 스레드를 데몬 스레드로 만듦
        thread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("메인 스레드 종료");

        // 출력 ---------------------------
        // 작업 내용을 저장
        // 작업 내용을 저장
        // 메인 스레드 종료
    }
}
