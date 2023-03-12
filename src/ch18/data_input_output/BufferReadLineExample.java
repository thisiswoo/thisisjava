package ch18.data_input_output;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReadLineExample {
    public static void main(String[] args) {
        try {
            // FileReader에 BufferedReader 보조 스트림 연결
            BufferedReader br = new BufferedReader(
                    new FileReader("/Users/geonu/Development/java/thisisjava/src/ch18/data_input_output/BufferReadLineExample.java")
            );

            int lineNo = 1;
            while (true) {
                String str = br.readLine(); // 1행을 읽음
                if (str == null) break;     // 더 이상 읽을 내용이 없으면 while문 종료
                System.out.println(lineNo + "\t" + str);
                lineNo++;
            }

            // BufferedReader를 닫으면 연결된 보조 스트림 FileReader도 닫힘
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 출력 --------------------------------------------
    // 1	package ch18.data_input_output;
    // 2
    // 3	import java.io.BufferedReader;
    // 4	import java.io.FileReader;
    // 5
    // 6	public class BufferReadLineExample {
    // 7	    public static void main(String[] args) {
    // 8	        try {
    // 9	            // FileReader에 BufferedReader 보조 스트림 연결
    // 10	            BufferedReader br = new BufferedReader(
    // 11	                new FileReader("/Users/geonu/Development/java/thisisjava/src/ch18/data_input_output/BufferReadLineExample.java")
    // 12	            );
    // 13
    // 14	            int lineNo = 1;
    // 15	            while (true) {
    // 16	                String str = br.readLine(); // 1행을 읽음
    // 17	                if (str == null) break;     // 더 이상 읽을 내용이 없으면 while문 종료
    // 18	                System.out.println(lineNo + "\t" + str);
    // 19	                lineNo++;
    // 20	            }
    // 21
    // 22	            // BufferedReader를 닫으면 연결된 보조 스트림 FileReader도 닫힘
    // 23	            br.close();
    // 24	        } catch (Exception e) {
    // 25	            e.printStackTrace();
    // 26           }
    // 27       }
    // 28   }

}