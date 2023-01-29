package ch07.oop_extends;

public final class Jdk15SealedEmployee extends Jdk15SealedPerson {

    @Override
    public void work() {
        System.out.println("제품을 생산합니다.");
    }
}
