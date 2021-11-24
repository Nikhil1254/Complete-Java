package multithreading;

import org.w3c.dom.css.Counter;

public class Example {

    static synchronized int Counter(){
        return ++count;
    }

  static int count = 0;

  public static void main(String[] args) {
    Example obj = new Example();

    Thread thread1 = obj.new Counter1();
    Thread thread2 = obj.new Counter2();

    thread1.start();
    thread2.start();
    /*
        - This the problem with threading
        - if more than one methods using a resource we can get different output
        - Thats why we use Synchronized , due to which what happends when one synchronized method accessing that resource no other method can access it at the same time.

    */
  }

  class Counter1 extends Thread {

    public void run() {
      for (int i = 0; i < 10; i++) {
        System.out.println("Counter1 : " + Counter());
      }
    }
  }

  class Counter2 extends Thread {

    public void run() {
      for (int i = 0; i < 10; i++) {
        System.out.println("Counter2 : " + Counter());
      }
    }
  }
}
