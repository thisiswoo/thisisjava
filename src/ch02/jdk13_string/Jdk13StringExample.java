package ch02.jdk13_string;

public class Jdk13StringExample {
    public static void main(String[] args) {

        // JDK 15+
        String str = """
                AAA
                BBB
                CCC
                """;
        System.out.println(str);
        // 출력
        // AAA
        // BBB
        // CCC
    }
}
