package ch14.multi_thread;

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new InterruptPrintThread();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e ) {
            e.printStackTrace();
        }

        thread.interrupt(); // interrupt() 메서드 호출

        // 결과 -------------------------------
        // 실행 중
        // ...
        // java.lang.InterruptedException: sleep interrupted
        //	at java.base/java.lang.Thread.sleep(Native Method)
        //	at ch14.multi_thread.InterruptPrintThread.run(InterruptPrintThread.java:8)
    }
}
