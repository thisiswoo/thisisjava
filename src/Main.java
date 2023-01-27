public class Main {
    public static void main(String[] args) {

        /*// JDK 15+
        String str = """
        AAA
        BBB
        CCC
        """;
        System.out.println(str);
        // 출력
        // AAA
        // BBB
        // CCC

        // JDK 12+
        char grade = 'B';
        switch (grade) {
            case 'A', 'a' -> System.out.println("학점 A");        // A 또는 a
            case 'B', 'b' -> System.out.println("학점 B");        // B 또는 b
            default -> System.out.println("학점 A, B가 아닙니다.");  // A,a,B,b 가 아닐때
        }

        int score = switch (grade) {
            case 'A' -> 100;
            case 'B' -> {
                int resut = 100 - 20;
                // JDK 13+
                yield resut;
            }
            default -> 60;
        };
        System.out.println("score : " + score);

        enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

        int numLetters = 0;
        Day day = Day.WEDNESDAY;
        switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> numLetters = 6;
            case TUESDAY -> numLetters = 7;
            case THURSDAY, SATURDAY -> numLetters = 8;
            case WEDNESDAY -> numLetters = 9;
            default -> throw new IllegalStateException("Invalid day: " + day);
        }
        System.out.println(numLetters);*/

        int sum = 0;
        int i = 1;
        while(i <= 100) {
            sum += i;
            i++;    // i가 100까지 i++되어 while문을 타게 되고 해당 code에서 +1이 되어 i = 101이 된다.
        }
        System.out.println("1~" + (i - 1) + "합 : " + sum);

        String name1 = "홍길동";
        String name2 = "홍길동";

        System.out.println("name1 compare == : " + name1 == name2);   // false
        System.out.println("name2 compare equals() : " + name1.equals(name2)); // true

        // String replace()
        String ssn = "890605-12345678";
        String firstNum = ssn.substring(0, 6);
        System.out.println("firstNum substring : " + firstNum);
        String SecNum = ssn.substring(7);
        System.out.println("firstNum SecNum : " + SecNum);

        // String indexOf()
        String subject = "자바 프로그래밍";
        int isConIdxOf = subject.indexOf("프로그래밍"); // 3 return
        System.out.println("String indexOf() contains idx : " + isConIdxOf);
        int isNotConIdxOf = subject.indexOf("Java"); // -1 return
        System.out.println("String indexOf() not contains idx : " + isNotConIdxOf);

        // String contains()
        boolean isContains1 = subject.contains("자바"); // true
        System.out.println("String contains() boolean isContains1 : " + isContains1);
        boolean isContains2 = subject.contains("Java"); // false
        System.out.println("String contains() boolean isContains2 : " + isContains2);


        // ------------------------------------------------
        double position = 1.0;
        double initial = 1.0;
        double rate = 1.0;

        position = initial + rate * 60;

        // Calculator.java instance vs static ------------
        double calResult1 = 10 * 10 * Calculator.pi;
        System.out.println("Calculator instance vs static 1 : " + calResult1);

        int calResult2 = Calculator.plus(10, 20);
        System.out.println("Calculator instance vs static 2 : " + calResult2);

        int calResult3 = Calculator.minus(10, 5);
        System.out.println("Calculator instance vs static 3 : " + calResult3);

        System.out.println("Calculator instance vs static 4 : " + Calculator.info);

        // Earth.java ------------------------------------
        // 상수 읽기
        System.out.println("Earth  : " + Earth.EARTH_RADIUS + "km");
        System.out.println("Earth  : " + Earth.EARTH_SURFACE_AREA + "km^2");

        // Singleton.java ------------------------------------
        // Singleton obj1 = new Singleton();   // 컴파일 에러
        // Singleton obj2 = new Singleton();   // 컴파일 에러

        // 정적 메소드를 호출해서 싱글톤 객체를 얻음
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // 동일한 객체를 참조하는지 확인
        if (obj1 == obj2) {
            System.out.println("같은 Singleton 객체입니다.");
        } else {
            System.out.println("다른 Singleton 객체입니다.");
        }

    }
}
