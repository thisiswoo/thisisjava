package ch05.reference_type;

public class EqualsExample {

    public static void main(String[] args) {

        // Java는 문자열 리터럴이 동일하다면 String 객체를 공유하도록 설계.
        // 다음과 같이 변수에 저장할 경우 각 변수는 '동일한 String 객체'의 번지가 저장된다.
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

//        boolean strVarResult = strVar1 == strVar2 ? true : false;
//        if (strVarResult) {
        if (strVar1 == strVar2) {
            System.out.println("strVar1 and strVar2 have the 'SAME' reference");
        } else {
            System.out.println("strVar1 and strVar2 have the 'DIFFERENT' reference");
        }
        if (strVar1.equals(strVar2)) {
            System.out.println("strVar1 and strVar2 have the 'Equal String'");
        } else {
            System.out.println("strVar1 and strVar2 have the 'Not-Equal String'");
        }

        System.out.println("");

        // new 연산자는 새로운 객체를 만드는 연산자
        String name1 = "홍길동";
        String name2 = "홍길동";
        String name3 = new String("홍길동");
        System.out.println(name1 == name2); // true
        System.out.println(name1 == name3); // false
        System.out.println(name2 == name3); // false

        System.out.println("");

        // '.equals' 는 객체 안의 데이터(문자열) 값이 같은지 확인.
//        boolean result1 = name1.equals(name2);  // always true
//        boolean result2 =! name1.equals(name2); // alwate false

        System.out.println(name1.equals(name2));    // true
        System.out.println(!name1.equals(name2));   // false
        System.out.println(name1.equals(name3));   // true
        System.out.println(name2.equals(name3));   // true

        System.out.println("");

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if (strVar3 == strVar4) {
            System.out.println("strVar3 and strVar4 have the 'SAME' reference");
        } else {
            System.out.println("strVar3 and strVar4 have the 'DIFFERENT' reference");
        }
        if (strVar3.equals(strVar4)) {
            System.out.println("strVar3 and strVar4 have the 'Equal String'");
        } else {
            System.out.println("strVar3 and strVar4 have the 'Not-Equal String'");
        }

    }
}
