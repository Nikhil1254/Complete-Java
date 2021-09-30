public class MultiThreadingDemo {
    public static void main(String[] args) throws Exception {
        Thread obj1 = new Hi(); // implementing using Thread class
        Thread obj2 = new Hello();
        Runnable obj = new Hola();
        Thread obj3 = new Thread(obj);// to convert Runnable to Thread object
        Runnable obj4 = () -> {
            for (int i = 0; i < 3; i++)
                System.out.println("hey");
        };// implementing runnable using lambda expression
        Thread obj5 = new Thread(obj4);

        Thread obj6 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++)
                    System.out.println("ssup");
            }
        };// implementing Thread using inner class

        obj1.setName("Hi Thread");
        obj2.setName("Hello Thread");
        obj3.setName("Hola Thread");
        obj5.setName("hey Thread");
        obj6.setName("ssup Thread");

        obj3.setPriority(10);
        obj6.start();// ssup
        obj5.start();// Hey
        obj1.start();// Hi
        obj2.start();// Hello
        obj3.start();// Hola

        obj6.join();
        obj1.join();
    }
}

class Hi extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++)
            System.out.println("Hi");
    }
}

class Hello extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++)
            System.out.println("hello");
    }
}

class Hola implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++)
            System.out.println("Hola");
    }
}

// Runnable is a functional interface so we can write lambda function for it to
// save coding