package ch14.multi_thread;

public class SyncUser1Thread extends Thread {
    private SyncCalculator syncCalculator;

    public SyncUser1Thread() {
        setName("SyncUser1Thread"); // 스레드 이름 변경
    }

    // 외부에서 공유 객체인 SyncCalculator를 받아 필드에 저장
    public void setSyncCalculator(SyncCalculator syncCalculator) {
        this.syncCalculator = syncCalculator;
    }

    // 동기화 메서드 호출
    @Override
    public void run() {
        syncCalculator.setMemory1(100);
    }
}
