package ch19.network_io;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
    public static void main(String[] args) {
        try {
            // Socket 생성과 동시에 localhost의 50001 port 연결 요청
            Socket socket = new Socket("localhost", 50001);
            System.out.println("[클라이언트] 연결 성공");
            // -----------------------------------------------------------------------------------
            /*
            // 데이터 보내기
            String sendMsg = "졸려~~~~~~~~";
            OutputStream os = socket.getOutputStream();
            byte[] bytes = sendMsg.getBytes("UTF-8");
            os.write(bytes);
            os.flush();
            System.out.println("[클라이언트] 데이터 모냄 : " + sendMsg);

            // 데이터 받기
            InputStream is = socket.getInputStream();
            bytes = new byte[1024];
            int readByteCount = is.read(bytes);
            String receiveMsg = new String(bytes, 0, readByteCount, "UTF-8");
            System.out.println("[클라이언트] 데이터 받음 : " + receiveMsg);
            */

            // 데이터 보내기
            String sendMsg = "졸려~~~~~~~~";
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF(sendMsg);
            dos.flush();
            System.out.println("[클라이언트] 데이터 모냄 : " + sendMsg);

            // 데이터 받기
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            String receiveMsg = dis.readUTF();
            System.out.println("[클라이언트] 데이터 받음 : " + receiveMsg);

            // -----------------------------------------------------------------------------------
            // Socket 닫기
            socket.close();
            System.out.println("[클라이언트] 연결 끊음");
        } catch (UnknownHostException e) {
            // IP 표기 방법이 잘못되었을 경우
            e.printStackTrace();
        } catch (IOException e) {
            // 해당 port의 서버에 연결할 수 없는 경우
            e.printStackTrace();
        }
    }
}
