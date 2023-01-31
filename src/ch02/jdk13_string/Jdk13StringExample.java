package ch02.jdk13_string;

public class Jdk13StringExample {
    public static void main(String[] args) {

        // JDK 13+
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
        System.out.println(str.length());
        System.out.println(str.replace("\n", "D"));

        System.out.println();

        String str2 = "" +
                "{\n" +
                "\t\"id\":\"winter\",\n" +
                "\t\"name\":\"눈송이\",\n" +
                "}";
        String str3 = """
                {
                    "id":"winter",
                    "name":"눈송이"
                }
                """;
        String str4 = """
                나는 자바를 \
                학습합니다.
                나는 자바 고수가 될 겁니다.
                """;
        System.out.println(str2);

        System.out.println();

        System.out.println(str3);

        System.out.println();

        System.out.println(str4);
    }
}
