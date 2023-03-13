package ch18.data_input_output;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("/Users/geonu/Development/java/thisisjava/src/ch18/data_input_output/test.txt");
            PrintStream ps = new PrintStream(fos);

            ps.print("마치 ");
            ps.println("프린터가 출력하는 것처럼 ");
            ps.println("데이터를 출력합니다.");
            ps.printf("| %6d | %-10s | %-10s | \n", 1, "Java", "기본");
            ps.printf("| %6d | %-10s | %-10s | \n", 2, "Sping", "기본");

            ps.flush();
            ps.close(); // PrintStream을 닫으면 연결된 보조 스트림 FileOutputStream도 닫힘
        } catch (Exception e) {
            e.printStackTrace();
        }

        // test.txt 파일을 열어보면 아래와 같이 작성되어 있음
        // 마치 프린터가 출력하는 것처럼
        // 데이터를 출력합니다.
        // |      1 | Java       | 기본         |
        // |      2 | Sping      | 기본         |
    }
}
