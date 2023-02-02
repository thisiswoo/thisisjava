package ch11.exception;

public class ExceptionHanflingExample {
    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자 수 : " + result);
        } catch (NullPointerException e) {
            // 예외 정보를 얻는 3가지 방법
//            System.out.println(e.getMessage()); // Cannot invoke "String.length()" because "data" is null
//            System.out.println(e.toString());   // java.lang.NullPointerException: Cannot invoke "String.length()" because "data" is null
            e.printStackTrace();    // error log
            // java.lang.NullPointerException: Cannot invoke "String.length()" because "data" is null
            // at ch11.exception.ExceptionHanflingExample.printLength(ExceptionHanflingExample.java:6)
            // at ch11.exception.ExceptionHanflingExample.main(ExceptionHanflingExample.java:20)

        } finally {
            System.out.println("[마무리 실행]\n");
        }
    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작] \n");
        printLength("thisiswoo");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}
