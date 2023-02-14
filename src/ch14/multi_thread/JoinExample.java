package ch14.multi_thread;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        // 1. try catch 를 사용해서 출력해보기 - 5050
        try {
            sumThread.join();
        } catch (InterruptedException e) {
        }
        // 2. try catch 주석하여 출력해보기 - 0
        System.out.println("1 ~ 100 합 : " + sumThread.getSum());
    }
}
