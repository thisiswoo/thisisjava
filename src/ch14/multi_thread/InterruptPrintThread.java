package ch14.multi_thread;

public class InterruptPrintThread extends Thread{
    public void run() {
        try {
            while (true) {
                System.out.println("실행 중");
                Thread.sleep(1); // 일시 정지를 만듦 (InterruptedException 이 발생할 수 있게)
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(("리소스 정리"));
        System.out.println(("실행 종료"));
    }
}
