package ch07.oop_extends;

public class Jdk12InstanceofExample {

    // main() 메서드에서 바로 호출하기 위해 정적 메서드(static) 선언
    public static void personInfo(Jdk12InstanceofPerson person) {
        System.out.println("name : " + person.name);
        person.walk();

        // person이 참조하는 객체가 Jdk12InstanceofStudent 타입인지 확인
        /*
            if (person instanceof Jdk12InstanceofStudent) {
            // Student 객체일 경우 강제 타입 변환
            Jdk12InstanceofStudent student = (Jdk12InstanceofStudent) person;
            // Student 객체만 가지고 있는 필드 및 메소드 사용
            System.out.println("studentNo : " + person.name);
            student.study();
        */

        // Java 12+ 부터 사용 가능 --------------------------------------
        // persondl 참조하는 객체가 Student 타입일 경우
        // student 변수에 대입(타입 변환 발생)
        if (person instanceof Jdk12InstanceofStudent student) {
            System.out.println("studentNo : " + person.name);
            student.study();
        }

    }

    public static void main(String[] args) {
        // person 객체를 매개값으로 제공하고 personInfo() 메서드 호출
        Jdk12InstanceofPerson p1 = new Jdk12InstanceofPerson("홍길동");
        personInfo(p1);

        System.out.println();

        // student 객체를 매개값으로 제공하고 personInfo() 메서드 호출
        Jdk12InstanceofPerson p2 = new Jdk12InstanceofStudent("김길동", 10);
        personInfo(p2);
    }
}
