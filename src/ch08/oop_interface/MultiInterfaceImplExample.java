package ch08.oop_interface;

public class MultiInterfaceImplExample {

    public static void main(String[] args) {
        // RemoteControl dlsxjvpdltm qustn tjsdjs al rngus rorp eodlq
        RemoteControl rc = new SmartTelevision();

        // RemoteControl 인터페이스에 선언된 추상 메서드만 호출 가능
        rc.turnOn();
        rc.turnOff();

        // Searchable 인터페이스 변수 선언 및 구현 객체 대입
        Searchable sc = new SmartTelevision();

        // Searchable 인터페이스에 선언된 추상 메서드만 호출 가능
        sc.search("https://thisiswoo.github.io");
    }
}
