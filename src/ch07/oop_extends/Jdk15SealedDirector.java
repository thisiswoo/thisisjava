package ch07.oop_extends;

public class Jdk15SealedDirector extends Jdk15SealedManager {
    @Override
    public void work() {
        System.out.println("제품을 기획합니다.");
    }
}
