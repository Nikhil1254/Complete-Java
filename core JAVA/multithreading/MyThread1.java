package multithreading;

public class MyThread1 extends Thread {

  @Override
  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.println("This is MyThrea1 which extends Thread - " + i);
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }

  public static void main(String[] args) {
    MyThread1 thread1 = new MyThread1(); //MyThread1 thread - extends Thread class
    MyThread obj = new MyThread();
    Thread thread2 = new Thread(obj); //MyThread thread - implements Runnable interface

    // //starting thread
    // thread1.start();
    // thread2.start();
    // try {
    //   thread1.join();
    //   thread2.join();
    // } catch (Exception e) {
    //   System.out.println(e.getMessage());
    // }

    // //Thread methods
    // thread1.setName("Nikhil_MyThread1");
    // thread2.setName("Kedar_MyThread");
    // System.out.println("Im main thread with id :"+Thread.currentThread().getId());
    // System.out.println(thread1.getName() + ":" + thread1.getId());
    // System.out.println(thread2.getName() + ":" + thread2.getId());
    // System.out.println("This is main thread.");
    // System.out.println(Thread.currentThread().getName());
  }
}
