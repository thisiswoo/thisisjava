package ch04.jdk12_switch;

public class Jdk12SwitchExample {

    public static void main(String[] args) {
        // JDK 12+
        char grade = 'B';

        switch (grade) {
            case 'A', 'a' -> {
                System.out.println("우수 회원입니다.");
            }
            case 'B', 'b' -> {
                System.out.println("일반 회원입니다.");
            }
            default -> {
                System.out.println("손님 입니다.");
            }
        }

        //위 코드를 줄여서
        switch (grade) {
            case 'A', 'a' -> System.out.println("학점 A");        // A 또는 a
            case 'B', 'b' -> System.out.println("학점 B");        // B 또는 b
            default -> System.out.println("학점 A, B가 아닙니다.");  // A,a,B,b 가 아닐때
        }
    }

}
