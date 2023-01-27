package ch07.oop_extends;

public class Jdk12InstanceofStudent extends Jdk12InstanceofPerson {
    // 필드 선언
    public int studentNo;

    // 생성자 선언
    public Jdk12InstanceofStudent(String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }

    // 메서드 선언
    public void study() {
        System.out.println("공부를 합니다.");
    }
}
