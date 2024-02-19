// Implementing the Runnable Class (Another way of creating thread)

class A implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Class A");

            try {
                Thread.sleep(2); // wait for 10ms before printing next item
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Class B");

            try {
                Thread.sleep(2); // wait for 10ms before printing next item
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

// Main Class
public class Threads2 {
    public static void main(String args[]) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        // We need to create the Thread objects to call the start() method of thread
        // class as Runnable doesnt provide this method
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}
