package ch08.oop_interface;

public class SmartTelevision implements RemoteControl, Searchable {
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("현재 볼륨 : " + volume);
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
}
