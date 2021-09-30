public class StaticBlockDemo {
    static {
        System.out.println("Hello Nikhil.");
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    static {
        System.out.println("hello Jeet.");
    }

}

class Calc {
    int num1;
    int num2;
    static String operation;

    static {
        operation = "Multiplication";
    }

    public Calc(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}