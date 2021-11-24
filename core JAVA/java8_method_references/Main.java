package java8_method_references;

public class Main {

  public static void main(String[] args) {
    // static method refference
    // className::staticMethodName
    Runnable obj1 = Stuff::doStuff;
    Thread thread1 = new Thread(obj1);
    thread1.start();

    // instance method refference
    // object::instanceMethodName
    Runnable obj2 = new Stuff()::printNum;
    Thread thread2 = new Thread(obj2);
    thread2.start();

    // Constructor refference
    // className::new;
    Runnable obj3 = Stuff::new;
    Thread thread3 = new Thread(obj3);
    thread3.start();

    try {
      thread1.join();
      thread2.join();
      thread3.join();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    //trying with user interfaces and classes
    StudentInter student = Functionality::showMessage;
    student.display();
    /*
        - Method refference is basically alternative of lambda expression.
        - Its mainly used for code reusability.
        - As its alternative of lambda expression only it can be used with functional interfaces only.
        - argument type of method we are reffring and method in functional interface should be same.As we are actually overriding that method.
        - Return types can differ cause its overriding actually but argument types should be same otherwise we will get error.
        - As we have 3 types oof method we have 3 types of method refferences
        - 1) static method refference
        - 2) instance method refference
        - 3) constructor method reffrence (cause constructor is also a method but of special type)

    */
  }
}
