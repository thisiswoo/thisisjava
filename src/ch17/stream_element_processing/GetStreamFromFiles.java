package ch17.stream_element_processing;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class GetStreamFromFiles {
    public static void main(String[] args) throws Exception {
        // GetStreamFromFilesData.txt 파일의 경로(Path) 객체 얻기
        Path path = Paths.get(GetStreamFromFiles.class.getResource("GetStreamFromFilesData.txt").toURI());
        // Path로부터 파일을 열고 한 생씩 읽으면서 문자열 스트림 생성, 기본 UTF-8 문자섹으로 읽음
        Stream<String> stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(line -> System.out.println(line));
        stream.close();

        // 출력 --------------------------------------------------------------
        // {"pno":1, "name":"상품1", "company":"멋진 회사", "price":2340}
        // {"pno":2, "name":"상품2", "company":"멋진 회사", "price":392}
        // {"pno":3, "name":"상품3", "company":"멋진 회사", "price":4309}
        // {"pno":4, "name":"상품4", "company":"멋진 회사", "price":568}
        // {"pno":5, "name":"상품5", "company":"멋진 회사", "price":4901}
    }
}
