package ch05.reference_type;

public class CharAtExample {

    public static void main(String[] args) {

        String ssn = "8906051234567";
        // 주민번호 앞자리를 뽑아서 남/녀/알수없음 알아내기.
        char sex = ssn.charAt(6); // ssn의 문자열 중(0번째 부터 시작) 6번째 문자 뽑기.
        switch (sex) {
            case '1', '3' -> System.out.println("남자입니다.");
            case '2', '4' -> System.out.println("여자입니다");
            default -> System.out.println("알수없음");
        }
    }
}
