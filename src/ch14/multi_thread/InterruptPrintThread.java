package ch14.multi_thread;

public class InterruptPrintThread extends Thread{
    public void run() {
        try {
            while (true) {
                System.out.println("실행 중");
                // 방법 1. 일시 정지를 만듦 (InterruptedException 이 발생할 수 있게)
                Thread.sleep(1);
                // 방법 2. interrupted() 메서드를 통해 interrupt() 메서드가 호출 되었다면 while 문을 빠져 나가게
                if (Thread.interrupted()) {
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(("리소스 정리"));
        System.out.println(("실행 종료"));
    }
}
