package ch07.oop_extends;

public abstract class AbstractAnimal {
    // 메서드 선언
    public void breath() {
        System.out.println("숨을 쉽니다");
    }

    // 추상 메서드 선언
    public abstract void sound();
}
