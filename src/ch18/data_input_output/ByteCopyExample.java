package ch18.data_input_output;

import java.io.*;

public class ByteCopyExample {
    public static void main(String[] args) {
        String originalFileName = "/Users/geonu/Development/java/thisisjava/src/ch18/data_input_output/download.jpeg";
        String targetFileName = "/Users/geonu/Development/java/thisisjava/src/ch18/data_input_output/download.jpeg";

        // 입출력 스트림 생성
        try (
                InputStream is = new FileInputStream(originalFileName);
                OutputStream os = new FileOutputStream(targetFileName)
        ) {
            byte[] data = new byte[1024];   // 읽은 바이트를 저장할 배열 생성
            while (true) {
                int num = is.read();    // 최대 1024 바이트를 읽고 배열에 저장, 읽은 바이트는 리턴
                if (num == -1) break;   // 파일을 다 읽으면 while 문 종료
                os.write(data, 0, num);     // 읽은 바이트 수 만큼 출력
            }
            os.flush(); // 내부 버퍼 잔류 바이트를 출력하고 버퍼를 비움
//            os.close();
//            is.close();

            System.out.println("복사가 잘 되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 출력 -------------------------
        // 복사가 잘 되었습니다.

    }
}
