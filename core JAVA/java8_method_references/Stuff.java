package java8_method_references;

public class Stuff {

  // CONSTRUCTOR
  public Stuff() {
    for (int i = 1; i <= 10; i++) {
      System.out.println("hello i'm constructor " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }

  //static method
  public static void doStuff() {
    for (int i = 1; i <= 10; i++) {
      System.out.println("doStuff method(static method) " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }

  //instance method
  public void printNum() {
    for (int i = 1; i <= 10; i++) {
      System.out.println("printNumber method(instance method) " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}
