package ch07.oop_extends;

public sealed class Jdk15SealedPerson permits Jdk15SealedEmployee, Jdk15SealedManager {
    // pield
    public String name;

    // method
    public void work() {
        System.out.println("하는 일이 결정되지 않았습니다");
    }
}
