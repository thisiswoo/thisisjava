package ch08.oop_interface;

public class Television implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("TV를 킵니다.");
    }
}
