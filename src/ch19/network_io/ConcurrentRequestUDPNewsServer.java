package ch19.network_io;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentRequestUDPNewsServer {
    private static DatagramSocket datagramSocket = null;
    // 10개의 스레드로 요청을 처리하는 스레드 풀 생성
    private static ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        System.out.println("-----------------------------------------------");
        System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter 키를 입력하세요");
        System.out.println("-----------------------------------------------");

        // UDP 서버 시작
        startServer();

        // 키보드 입력
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String key = scanner.nextLine();
            if (key.toLowerCase().equals("q") || key.equals("Q")) {
                break;
            }
        }
        scanner.close();

        // UDP 서버 종료
        stopServer();
    }

    public static void startServer() {
        // 작업 스레드 정의
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    // DatagramSocket 생성 및 port 바인딩
                    datagramSocket  = new DatagramSocket(50001);
                    System.out.println("[서버] 시작됨");

                    while (true) {
                        // 클라이언트가 구독하고 싶은 뉴스 주제 얻기 (받는 데이터의 크기는 length가 buf 보다 작거나 같아야 한다.)
                        DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
                        System.out.println("클라이언트의 희망 뉴스 종류 얻기 위해 대기함");
                        datagramSocket.receive(receivePacket);

                        // 작업 큐에 처리 작업 넣기. Runnable은 함수형 인터페이스이므로 람다식으로 표현 가능
                        executorService.execute(() -> {
                            try {
                                String newsKind = new String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");

                                // 클라이언트의 IP와 port 정보가 있는 SocketAddress 얻기
                                SocketAddress socketAddress = receivePacket.getSocketAddress();

                                // 10개의 뉴스를 클라이언트로 전송
                                for (int i = 1; i <= 10; i++) {
                                    String data = newsKind + ": 뉴스" + i;
                                    byte[] bytes = data.getBytes("UTF-8");
                                    DatagramPacket sendPacket = new DatagramPacket(bytes, 0, bytes.length, socketAddress);
                                    datagramSocket.send(sendPacket);
                                    Thread.sleep(1000); // 1초 쉬고
                                }
                            } catch (Exception e) {}
                        });
                    }
                } catch (Exception e) {
                    System.out.println("[서버] " + e.getMessage());
                }
            }
        };
        // 작업 스레드 시작
        thread.start();
    }

    public static void stopServer() {
        // DatagramSocket을 닫고 port 언바인딩
        datagramSocket.close();
        // 스레드풀 종료
        executorService.shutdownNow();
        System.out.println("[서버] 종료됨");
    }
}
