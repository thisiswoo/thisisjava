package ch04.jdk12_switch;

public class Jdk13SwtichYieldExample {

    public static void main(String[] args) {
        String grade = "B";

        //Java 11 이전 문법
        int previousVersionJDK11 = 0;
        switch (grade) {
            case "A":
                previousVersionJDK11 = 100;
                break;
            case "B":
                int result = 100 - 20;
                previousVersionJDK11 = result;
                break;
            default:
                previousVersionJDK11 = 60;
        }
        System.out.println("[Java 11 이전 문법] switch : " + previousVersionJDK11);

        //Java 12부터 가능
        switch (grade) {
            case "A", "a" -> System.out.println("[Java 12부터 가능 문법] switch : 학점 A");        // A 또는 a
            case "B", "b" -> System.out.println("[Java 12부터 가능 문법] switch : 학점 B");        // B 또는 b
            default -> System.out.println("[Java 12부터 가능 문법] switch : 학점 A, B가 아닙니다.");  // A,a,B,b 가 아닐때
        }

        //Java 13부터 가능
        int availableFromJDK12 = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };
        System.out.println("[Java 13부터 가능 문법] switch + yield : " + availableFromJDK12);
    }
}
