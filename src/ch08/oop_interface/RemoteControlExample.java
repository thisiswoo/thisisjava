package ch08.oop_interface;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        // rc 변수에 Television 객체를 대입
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
//        rc.turnOff();


        // default 메서드 호출
        rc.setMute(true);
        rc.setMute(false);

//        System.out.println("리모컨 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
//        System.out.println("리모컨 최소 볼륨 : " + RemoteControl.MIN_COLUME);

        System.out.println();

        // Audio 객체를 생성하고 인터페이스에 변수 대입
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
//        rc.turnOff();

        // default 메서드 호출
        rc.setMute(true);
        rc.setMute(false);

        // 정적 메소드 호출
        RemoteControl.changeBattery();
    }
}
