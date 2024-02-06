class Counter {
    int count = 0;

    public synchronized void counter() {
        count++;
    }
}

// Main Class
public class ThreadsWithMutations {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter(); // Creating the object of Counter Class

        Runnable obj1 = () -> {

            for (int i = 0; i < 10; i++) {
                c.counter();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 10; i++) {
                c.counter();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // If we dont use join() method of Thread Class then the output will be
        // unpredictable and keeps on changing everytime
        // we run it. Join() is a special method that allows your main thread to wait
        // for the other Threads to come back and
        // join.

        t1.join();
        t2.join();

        // Printing the value of count
        System.out.println(c.count);
    }
}