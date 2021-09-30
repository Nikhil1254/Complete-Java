public class dynamicMethodDispatch {
    public static void main(String[] args) {
        A obj = new B(); // upcasting
        obj.show();// run time polymorphism

    }
}

class A {
    public void show() {
        System.out.println("In class A");
    }
}

class B extends A {
    public void show() {
        System.out.println("In class B");
    }
}