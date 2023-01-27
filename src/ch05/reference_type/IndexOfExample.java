package ch05.reference_type;

public class IndexOfExample {

    public static void main(String[] args) {

        String subject = "자바 프로그래밍";

        // 문자열에서 특정 문자열의 위치를 찾고자 할 때에는 'indexOf()' 메서드를 사용.
        int location = subject.indexOf("프로그래밍");
        System.out.println(location); // 3
        String substring = subject.substring(location);
        System.out.println(substring); // 프로그래밍

        location = subject.indexOf("자바");
        if (location != -1) {
            System.out.println("자바와 '관련 된' 책이군요.");
        } else {
            System.out.println("자바와 '관련 없는' 책이군요.");
        }

    }
}
