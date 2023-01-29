package ch07.oop_extends;

public class AbstractDog extends AbstractAnimal {
    // 추상 메서드 재정의
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
