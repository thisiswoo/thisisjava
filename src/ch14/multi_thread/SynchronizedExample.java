package ch14.multi_thread;

public class SynchronizedExample {
    public static void main(String[] args) {
        SyncCalculator sc = new SyncCalculator();

        SyncUser1Thread user1 = new SyncUser1Thread();
        user1.setSyncCalculator(sc);
        user1.start();

        SyncUser2Thread user2 = new SyncUser2Thread();
        user2.setSyncCalculator(sc);
        user2.start();
    }
}
