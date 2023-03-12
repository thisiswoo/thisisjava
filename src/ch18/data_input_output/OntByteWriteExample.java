package ch18.data_input_output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OntByteWriteExample {
    public static void main(String[] args) {
        try {
            // 데이터 도착지를 test1.db 파일로 하는 바이트 출력 스트림 생성
            OutputStream os = new FileOutputStream("/Users/geonu/Development/git/blog/thisiswoo.github.io/assets/img/daily/routine/2023/2023-03-12/test1.db");

            byte a = 10;
            byte b = 20;
            byte c = 30;

            // 1byte씩 출력
            os.write(a);
            os.write(b);
            os.write(c);

            os.flush(); // 내부 버퍼에서 잔류하는 바이트를 출력하고 버퍼를 비움
            os.close(); // 출력 스트림을 닫아 사용한 메모리를 해제
        } catch (IOException e) {
            e.printStackTrace();
        }
        // os에 지정해준 해당 경로에 해당 파일 생성됨.
    }
}
