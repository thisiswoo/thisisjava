package ch18.data_input_output;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteFinalReadExample {
    public static void main(String[] args) {
        // 데이터 출발지를 test2.db로 하는 입력 스트림 생성
        try (InputStream is = new FileInputStream("/Users/geonu/Development/java/thisisjava/src/ch18/data_input_output/test2.db")) {
            byte[] data = new byte[100];

            while (true) {
                int num = is.read(data);    // 최대 100byte를 읽고 읽은 바이트는 data wj
                if (num == -1) break;   // 파일 끝에 도달했을 경우 while 문 종료

                for (int i = 0; i < num; i++) {
                    System.out.println(data[i]);    // 읽은 바이트를 출력
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 출력 ----------------------------
        // 20
        // 30
        // 40
    }
}
