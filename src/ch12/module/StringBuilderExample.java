package ch12.module;

public class StringBuilderExample {
    public static void main(String[] args) {
        // append("기본값 | 문자열") : 문자열 끝에 추가
        // insert(위치, "기본값 | 문자열") : 문자열을 지정 위치에 추가
        // delete(시작 위치, 끝 위치) : 문자열 일부를 삭제
        // replace(시작 위치, 끝 위치, "문자열") : 문자열 일부를 대체
        String data = new StringBuilder()
                .append("DEF")                             // DEF
                .insert(0, "ABC")           // ABCDEF
                .delete(3, 4)                              // ABCEF
                .replace(2, 3, "23")   // AB23EF
                .toString();
        System.out.println(data);
    }
}
