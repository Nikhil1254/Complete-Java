public class SyncDemo {
    public static void main(String[] args) throws Exception {
        Counter obj = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                obj.increament();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                obj.increament();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count " + obj.count); // expected output 2000
        // but we get less deu to shared memory problem
        // if we use syncronized method problem gets solved

    }
}

class Counter {
    int count;

    public synchronized void increament() {
        count++;
    }
}
