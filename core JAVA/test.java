public class test {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
    }
}

class Parent{
    public void display(){
        System.out.println("Hello Im parent");
    }

}

class Child extends Parent{
    public void display(){
        System.out.println("hello I'm child");
    }

    public void display1(){
        System.out.println("Hey Im another function of child");
    }
}