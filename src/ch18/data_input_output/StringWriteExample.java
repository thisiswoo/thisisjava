package ch18.data_input_output;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Paths;

public class StringWriteExample {
    public static void main(String[] args) {
        try {
            // 문자 기반 출력 스트림 생성
            Writer writer = new FileWriter("/Users/geonu/Development/java/thisisjava/src/ch18/data_input_output/test.txt");

            // 한 문자씩 출력
            char a = 'A';
            writer.write(a);
            char b = 'B';
            writer.write(b);

            // char 배열 출력
            char[] arr = { 'C', 'D', 'E' };
            writer.write(arr);

            // 문자열 출력
            writer.write("FGH");

            // 버퍼에 잔류하고 있는 문자를 출력하고, 버퍼를 비움
            writer.flush();

            // 출력 스트림을 닫고 메모리 해제
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // test.txt 파일 생성 후 ABCDEFGH 저장되어 있음.
    }
}
