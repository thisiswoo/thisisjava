package ch08.oop_interface;

public interface RemoteControl {
    // 상수 선언
    int MAX_VOLUME = 10;
    int MIN_COLUME = 0;

    // 추상 메서드
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    // default 인스턴스 메서드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
            // 추상 메서드 호출하면서 상수 필드 사용
            setVolume(MIN_COLUME);
        } else {
            System.out.println("무음을 해제합니다.");
        }
    }
}
