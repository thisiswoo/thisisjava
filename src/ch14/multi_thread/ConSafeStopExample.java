package ch14.multi_thread;

public class ConSafeStopExample {
    public static void main(String[] args) {
        ConPrintThread cpt = new ConPrintThread();
        cpt.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        cpt.setStop(true);  // ConPrintThread를 종료하기 위해 stop 필드값 변경
    }
}
