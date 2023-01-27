package ch04.jdk12_switch;

public class LableBreakExample {

    public static void main(String[] args) {
        Outer: for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println("[LableBreakExample] : " + upper + " - " + lower);
                if (lower == 'g') {
                    break Outer;
                }
            }
        }
        System.out.println("[LableBreakExample] program is over");
    }
}
