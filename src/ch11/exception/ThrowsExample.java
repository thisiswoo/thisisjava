package ch11.exception;

public class ThrowsExample {
    public static void main(String[] args) {
        // 예외는 호출한 곳에서 처리 해야 한다.
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
