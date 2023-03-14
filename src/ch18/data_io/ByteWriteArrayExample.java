package ch18.data_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteWriteArrayExample {
    public static void main(String[] args) {
        OutputStream os = null;
        try {
            // 데이터 도착지를 test2.db 파일로 하는 바이트 출력 스트림 생성
            os = new FileOutputStream("/Users/geonu/Development/java/thisisjava/src/ch18/data_input_output/test2.db");

            byte[] array = { 10, 20, 30, 40, 50 };

            os.write(array, 1, 3);  // 1번 idx부터 3개까지만 출력

            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        // 해당 경로에 test2.db 파일 생성
    }
}
