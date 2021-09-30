
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Student obj = new Student() {

            public void show() {
                System.out.println("Hello,I'm Anonymous inner class");
            }

            @Override
            public void display() {
                System.out.println("Hello");
            }

            public void display1() {
                System.out.println("Hola");
            }
        };

        obj.display();
        obj.display1();
        obj.show();
    }
}

abstract class Student {
    abstract void display();

    abstract void show();

    void display1() {
        System.out.println("Hi");
    }
}