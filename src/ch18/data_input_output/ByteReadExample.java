package ch18.data_input_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ByteReadExample {
    public static void main(String[] args) {

        // 방법 1
        /*InputStream is = null;
        try {
            // 데이터 출발지를 test1.db로 하는 입력 스트림 생성
            is = new FileInputStream("/Users/geonu/Development/java/thisisjava/src/ch18/data_input_output/test1.db");

            while (true) {
                int data = is.read();
                if (data == -1) break;
                System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        // 방법 2 위 코드를 간략하게
        try (InputStream is = new FileInputStream("/Users/geonu/Development/java/thisisjava/src/ch18/data_input_output/test1.db")) {
            while (true) {
                int data = is.read();
                if (data == -1) break;
                System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 출력 ---------------------------------
        // 10
        // 20
        // 30
    }
}
