package ch05.reference_type;

public class SubstringExample {

    public static void main(String[] args) {

        String ssn = "890605-1234567";

        // ssn문자열의 0번째 index부터 6번째 index(890605- 중에 -)의 앞(5)까지 자르기. -> 890605
        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);

        // ssn문자열의 7번째 index(1234567 중에 1)부터 끝까지 자르기. -> 1234567
        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }
}
