public class InnerClassDemo {
    public static void main(String[] args) {
        Outer obj = new Outer(6,4);
        Outer.Inner iobj = obj.new Inner();
        Outer.Inner1 i1obj = new Outer.Inner1();

        obj.display();
        iobj.display();
        i1obj.display();

    }
}

class Outer {
    int num1;
    int num2;

    public Outer(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void func() {
        System.out.println(num1+num2);
    }

    class Inner {
        public void display() {
            func();
        }
    }

    public void display() {
        System.out.println("Inside outer class.");
    }

    static class Inner1 {
        public void display() {
            System.out.println("Inside Inner1 class");
        }
    }
}
