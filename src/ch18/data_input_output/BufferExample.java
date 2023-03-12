package ch18.data_input_output;

import java.io.*;

public class BufferExample {
    public static void main(String[] args) {
        try {
            // 버퍼가 없는 스트림 생성
            String originalFilePath1 = BufferExample.class.getResource("originalFile1.jpg").getPath();
            String targetFilePath1 = "/Users/geonu/Development/java/thisisjava/src/ch18/data_input_output/targetFile1.jpg";

            FileInputStream fis1 = new FileInputStream(originalFilePath1);
            FileOutputStream fos1 = new FileOutputStream(targetFilePath1);

            // 버퍼가 있는 스트림 생성
            String originalFilePath2 = BufferExample.class.getResource("originalFile2.jpg").getPath();
            String targetFilePath2 = "/Users/geonu/Development/java/thisisjava/src/ch18/data_input_output/targetFile.jpg";

            FileInputStream fis2 = new FileInputStream(originalFilePath2);
            BufferedInputStream bis = new BufferedInputStream(fis2);
            FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
            BufferedOutputStream bos = new BufferedOutputStream(fos2);

            // 복사 시간 측정
            long nonBufferTime = copy(fis1, fos1);
            System.out.println("버퍼 미사용:\t" + nonBufferTime + " ns");

            long bufferTime = copy(bis, bos);
            System.out.println("버퍼 사용:\t" + bufferTime + " ns");

            // 스트림 닫기
            fis1.close();
            fos1.close();

            // fis2.close(), fos2.close()를 하지 않은 이유는 보조 스트림이 닫히면 연결된 스트림은 자동으로 닫힌다.
            bis.close();
            bos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static long copy(InputStream is, OutputStream os) throws Exception {
        long start = System.nanoTime();

        while (true) {
            int data = is.read();
            if (data == -1) break;
            os.write(data); // 시간 측정을 위한 1byte 읽기/쓰기 하기 위한
        }

        os.flush();

        long end = System.nanoTime();
        return (end - start);
    }

    // 출력 ---------------------------
    // 버퍼 미사용:	399007000 ns
    // 버퍼 사용:	5409166 ns
}
