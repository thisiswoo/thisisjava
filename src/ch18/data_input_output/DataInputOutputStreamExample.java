package ch18.data_input_output;

import java.io.*;

public class DataInputOutputStreamExample {
    public static void main(String[] args) {
        // DataOutputStream 생성
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("/Users/geonu/Development/java/thisisjava/src/ch18/data_input_output/test2.db");
            DataOutputStream dos = new DataOutputStream(fos);

            // 기본 타입 출력
            dos.writeUTF("Java");
            dos.writeDouble(95.5);
            dos.writeInt(1);

            dos.writeUTF("Spring");
            dos.writeDouble(92.2);
            dos.writeInt(2);

            dos.flush();
            dos.close(); // DataOutputStream을 닫으면 연결된 보조 스트림 FileOutputStream도 닫힘

            // DataInputStream 생성
            FileInputStream fis = new FileInputStream("/Users/geonu/Development/java/thisisjava/src/ch18/data_input_output/test2.db");
            DataInputStream dis = new DataInputStream(fis);

            // 기본 타입 입력
            for (int i = 0; i < 2; i++) {
                String name = dis.readUTF();
                double score = dis.readDouble();
                int order = dis.readInt();
                System.out.println(name + " : " + score + " : " + order);
            }

            dis.close();    // DataOutputStream을 닫으면 연결된 보조 스트림 FileOutputStream도 닫힘
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 출력 ---------------------------------------------
        // Java : 95.5 : 1
        // Spring : 92.2 : 2
    }
}
