
public class AbstractDemo {

    // Number is a abstarct class
    // all wrapper classes are its child
    public static void display(Number num) {
        System.out.println(num);
    }

    public static void main(String[] args) {
        display(5);// int
        display(5.5f);// float
        display(5.5);// double

        Writer obj = new Pen();
        obj.display();
        obj = new Pencil();
        obj.display();

        Pen obj1 = new Pen();
        obj1.display();

        System.out.println(obj1); // toString will be called when we try to print object
        System.out.println(obj);
    }
}

abstract class Writer {
    public abstract void display();

}

class Pen extends Writer {
    @Override
    public void display() {
        System.out.println("Writing with Pen.");
    }

    public String toString() {
        return "I am Pen Object";
    }
}

class Pencil extends Writer {
    @Override
    public void display() {
        System.out.println("Writing with Pencil.");
    }

    public String toString() {
        return "I am Pencil Object";
    }

}