package ch19.network_io;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPClient {
    public static void main(String[] args) {
        try {
            // DatagramSocket 생성
            DatagramSocket datagramSocket = new DatagramSocket();

            // 구독하고 싶은 뉴스 주제 보내기
            String data = "스포트";
            byte[] bytes = data.getBytes("UTF-8");
            DatagramPacket sendPacket = new DatagramPacket(
                    bytes, bytes.length, new InetSocketAddress("localhost", 50001)
            );
            datagramSocket.send(sendPacket);

            while (true) {
                // 뉴스 받기 (받는 데이터의 크기는 length가 buf 보다 작거나 같아야 한다.)
                DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);

                // 문자열로 변환
                String news = new String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");
                System.out.println(news);

                // 10 번째 뉴스를 받으면 while문 종료
                if (news.contains("뉴스10")) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("[서버] " + e.getMessage());
        }
    }
}
