package ch18.data_input_output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) {

        try {
            // file 객체 생성
            File dir = new File("/Users/geonu/Development/java/thisisjava/src/ch18/data_input_output/testFile");
            File file1 = new File("/Users/geonu/Development/java/thisisjava/src/ch18/data_input_output/exFile1.txt");
            File file2 = new File("/Users/geonu/Development/java/thisisjava/src/ch18/data_input_output/exFile2.txt");
            File file3 = new File("/Users/geonu/Development/java/thisisjava/src/ch18/data_input_output/exFile3.txt");

            // 존재하지 않으면 디렉토리 또는 파일 생성
            // FileOutputStream fos = new FileOutputStream("pathname");
            // 보통 아래와 같이 비어있는 파일을 생성하지 않고 위 주석처럼 FileOutputStream으로 파일을 생성한다.
            if (dir.exists() == false) dir.mkdirs();
            if (file1.exists() == false) file1.createNewFile();
            if (file2.exists() == false) file2.createNewFile();
            if (file3.exists() == false) file3.createNewFile();

            // testFile 폴더의 내용 출력
            File dataInputOutputDir = new File("/Users/geonu/Development/java/thisisjava/src/ch18/data_input_output");
            File[] contents = dataInputOutputDir.listFiles();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
            for (File file : contents) {
                System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
                if (file.isDirectory()) {
                    System.out.printf("%-10s%-20s", "<DIR>", file.getName());
                } else {
                    System.out.printf("%-10s%-20s", file.length(), file.getName());
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 출력 ---------------------------------------------------------------------------
        //                      .
        //                      .
        //                      .
        // 2023-03-14 AM 08:56      0         exFile3.txt
        // 2023-03-14 AM 08:56      0         exFile2.txt
        // 2023-03-14 AM 08:56      0         exFile1.txt
        // 2023-03-14 AM 08:56      <DIR>     testFile
        //                      .
        //                      .
        //                      .
    }
}
