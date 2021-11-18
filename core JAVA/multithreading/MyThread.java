package multithreading;
import java.lang.Runnable;

public class MyThread implements Runnable{
    @Override
    public void run(){
        for(int i=1 ; i<=10 ; i++){
            System.out.println("This is MyThread which implements Runnable - "+ (i*1));
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }        
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread() ;
        Thread thread = new Thread(mt);
        thread.start();
        System.out.println("Im main Thread.");
    }

}