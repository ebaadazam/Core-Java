// Extending the Thread Class (One way of creating thread)

class A extends Thread {
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

class B extends Thread {
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
public class Threads {
    public static void main(String args[]) {
        A obj1 = new A();
        B obj2 = new B();

        // starting both the threads with the start() method
        obj1.start();

        // Keep the gap of 1ms between both the threads
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        obj2.start();

    }
}
