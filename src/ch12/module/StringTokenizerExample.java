package ch12.module;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        // split은 정규 표현식으로 구분 => true/false
        // StringTokenizer는 문자로 구분 => ''
        String data1 = "홍길동&김길동,이길동";
        String[] arr = data1.split("&|,");  // [Ljava.lang.String;@36baf30c
        System.out.println(arr);
        for (String token : arr) {
            System.out.println(token);
        }
        System.out.println();

        String data2 = "홍길동/김길동/이길동";
        StringTokenizer st = new StringTokenizer(data2, "/");
        System.out.println(st); // java.util.StringTokenizer@7a81197d

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }

    }
}
