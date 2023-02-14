package ch14.multi_thread;

public class WorkYieldThread extends Thread {
    // 필드
    public boolean work = true;

    // 생성자 constructor
    public WorkYieldThread(String name) {
        setName(name);
    }

    // method
    @Override
    public void run() {
        while (true) {
            if (work) {
                System.out.println(getName() + ": 작업처리");
            } else {
                Thread.yield();
            }
        }
    }
}
