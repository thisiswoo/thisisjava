package ch14.multi_thread;

public class YieldExample {
    public static void main(String[] args) {
        WorkYieldThread wytA = new WorkYieldThread("workYieldThreadA");
        WorkYieldThread wytB = new WorkYieldThread("workYieldThreadB");
        wytA.start();
        wytB.start();

        // A thread
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // B thread
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
