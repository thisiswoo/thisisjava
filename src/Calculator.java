public class Calculator {
    String color;   // instance field
    void setColor(String color) {   // instance method
        this.color = color;
    }   // instance method

    static double pi = 3.14159; // static field
    static int plus(int x, int y) { // static method
        return x + y;
    }   // static method

    static int minus(int x, int y) { // static method
        return x - y;
    }   // static method

    static String company = "MyCompany";
    static String model = "LCD";
    static String info;

    static {
        info = company + "-" + model;
    }

}
