package ch14.multi_thread;

public class MainThreadExample {
    public static void main(String[] args) {
        System.out.println("시작 ----------------------->");

        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());    // main

        Thread currentThreadNull = null;

        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Thread.getName()" because "currentThreadNull" is null
        //	at ch14.multi_thread.MainThreadExample.main(MainThreadExample.java:11)
        System.out.println(currentThreadNull.getName());  // 즉, 스레드가 "main"인 곳에서 NullPointerException 발생

        System.out.println("종료 ----------------------->");
    }
}
