package ch14.multi_thread;

public class SyncCalculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

//    public void setMemory(int memory) {
//        this.memory = memory;
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//            System.out.println(Thread.currentThread().getName() + ": " + this.memory);  // 메모리값 읽기
//        }
//    }

    // 동기화 메서드
    public synchronized void setMemory1(int memory) {
        this.memory = memory; // 메모리값 저장
        try {
            Thread.sleep(2000); // 2초간 일시 정지
            System.out.println(Thread.currentThread().getName() + ": " + this.memory);  // 메모리값 읽기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setMemory2(int memory) {
        // 동기화 블록
        synchronized (this) {
            this.memory = memory;   // 메모리값 저장
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + ": " + this.memory);  // 메모리값 읽기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

