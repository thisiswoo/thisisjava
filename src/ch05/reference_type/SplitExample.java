package ch05.reference_type;

public class SplitExample {

    public static void main(String[] args) {

        // 문자열이 '구분자를 사용하여 여러 개의 문자열로 구성'되어 있을 경우,
        // '이를 따로 분리'해서 얻고 싶다면 split() 메서드를 사용
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동"     ;

        // 문자열 분리
        String[] tokens = board.split(","); // , 로

        // index별로 출력하기
        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }



}
