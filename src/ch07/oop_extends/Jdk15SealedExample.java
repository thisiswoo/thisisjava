package ch07.oop_extends;

public class Jdk15SealedExample {
    public static void main(String[] args) {
        Jdk15SealedPerson p = new Jdk15SealedPerson();
        Jdk15SealedEmployee e = new Jdk15SealedEmployee();
        Jdk15SealedManager m = new Jdk15SealedManager();
        Jdk15SealedDirector d = new Jdk15SealedDirector();

        p.work();
        e.work();
        m.work();
        d.work();
    }
}
