package ch07.oop_extends;

public non-sealed class Jdk15SealedManager extends Jdk15SealedPerson {
    @Override
    public void work() {
        System.out.println("생산 관리를 합니다.");
    }
}
