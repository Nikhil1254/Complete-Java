package lambaExpression;

public class Main {

  public static void main(String[] args) {
    MyInter obj = new MyInterImpl();
    obj.display();

    //use of lambda expression
    //lambda can be used with functional interfaces only.

    Thread thread = new Thread(
      () -> {
        for(int i=1 ; i<=10 ; i++){
            System.out.println("user thread "+i);
            try{
            Thread.sleep(1000);
            }  catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
      }
    );
    thread.start();
    System.out.println(
      "I'm main Thread with id " + Thread.currentThread().getId()
    );
  }
}
