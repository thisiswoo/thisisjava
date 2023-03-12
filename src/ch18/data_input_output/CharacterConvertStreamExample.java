package ch18.data_input_output;

import java.io.*;

public class CharacterConvertStreamExample {
    public static void main(String[] args) throws Exception {
        write("문자 변환 스트림을 사용합니다.");
        String data = read();
        System.out.println(data);
    }

    public static void write(String str) throws Exception {
        // FileOutputStream에 OutputStreamWriter 보조 스트림을 연결
        OutputStream os = new FileOutputStream("/Users/geonu/Development/java/thisisjava/src/ch18/data_input_output/test.txt");
        Writer writer = new OutputStreamWriter(os, "UTF-8");
        // OutputStreamWriter 보조 스트림을 이용해서 문자 출력
        writer.write(str);
        writer.flush();
        writer.close();
    }

    public static String read() throws Exception {
        // FileInputStream에 InputStreamReader 보조 스트림을 연결
        InputStream is = new FileInputStream("/Users/geonu/Development/java/thisisjava/src/ch18/data_input_output/test.txt");
        Reader reader = new InputStreamReader(is, "UTF-8");
        // InputStreamReader 보조 스트림을 이용해서 문자 입력
        char[] data = new char[100];
        int num = reader.read(data);
        reader.close();
        // char 배열에서 읽은 문자 수만큼 문자열로 변환
        String str = new String(data, 0, num);
        return str;
    }

    // 출력 --------------------------
    // 문자 변환 스트림을 사용합니다.
}
