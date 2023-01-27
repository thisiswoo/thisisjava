package ch05.reference_type;

public class ContainsExample {

    public static void main(String[] args) {

        String subject = "자바 프로그래밍";

        // 주어진 문자열이 단순히 '포함'되어 있는지만 조사하고 싶다면 contains() 메서드를 사용.
        // 포함되어 있으면 true, 아니면 false 를 return
        boolean result = subject.contains("자바");
        if (result) {
            System.out.println("자바와 '관련 된' 책이군요.");
        } else {
            System.out.println("자바와 '관련 없는' 책이군요.");
        }

    }

}
