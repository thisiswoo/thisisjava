package ch18.data_input_output;

import java.io.*;
import java.util.Arrays;

public class ObjectInputOutputStreamExample {
    public static void main(String[] args) {
        try {
            // FileOutputStream에 ObjectOutputStream 보조 스트림 연결
            FileOutputStream fos = new FileOutputStream("/Users/geonu/Development/java/thisisjava/src/ch18/data_input_output/object.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // 객체 생성
            ObjectInputOutputStreamMember m1 = new ObjectInputOutputStreamMember("fail", "단풍이");
            ObjectInputOutputStreamProduct p1 = new ObjectInputOutputStreamProduct("맥북", 1700000);
            int[] arr1 = { 1, 2, 3 };

            // 객체를 직렬화해서 파일에 저장
            oos.writeObject(m1);
            oos.writeObject(p1);
            oos.writeObject(arr1);

            oos.flush();
            oos.close();    // ObjectOutputStream를 닫으면 연결된 보조 스트림 FileOutputStream도 닫힘

            // FileInputStream에 ObjectInputStream 보조 스트림 연결
            FileInputStream fis = new FileInputStream("/Users/geonu/Development/java/thisisjava/src/ch18/data_input_output/object.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            // 파일을 읽고 역직렬화해서 객체로 복원
            ObjectInputOutputStreamMember m2 = (ObjectInputOutputStreamMember) ois.readObject();
            ObjectInputOutputStreamProduct p2 = (ObjectInputOutputStreamProduct) ois.readObject();
            int[] arr2 = (int[]) ois.readObject();

            ois.close();    // ObjectInputStream을 닫으면 연결된 보조 스트림 FileInputStream도 닫힘

            // 복원된 객체 내용 확인
            System.out.println(m2);
            System.out.println(p2);
            System.out.println(Arrays.toString(arr2));

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 출력 -------------------------------------------
        // ObjectInputOutputStreamMember{id='fail', name='단풍이'}
        // ObjectInputOutputStreamProduct{name='맥북', price=1700000}
        // [1, 2, 3]
    }
}
