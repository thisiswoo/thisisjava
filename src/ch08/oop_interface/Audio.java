package ch08.oop_interface;

public class Audio implements RemoteControl {

    // 필드 선언
    private int volume;
    private int memoryVolume;

    // turnOn 추상 메서드 오버라이딩
    @Override
    public void turnOn() {
        System.out.println("Audio를 킵니다.");
    }

    // turnOff 추상 메서드 오버라이딩
    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    // setVolume 추상 메서드 오버라이딩
    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_COLUME) {
            this.volume = RemoteControl.MIN_COLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio볼륨 : " + this.volume);
    }

    // default 메서드 재정의
    @Override
    public void setMute(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;
            System.out.println("무음 처리합니다.");
            setVolume(RemoteControl.MIN_COLUME);
        } else {
            System.out.println("무음을 해제합니다.");
            setVolume(this.memoryVolume);
        }
    }
}
