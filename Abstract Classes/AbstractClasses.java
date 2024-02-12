abstract class Car {

    int tyres;
    boolean on;
    int speed;

    // We can also Create constructors of an abstract class
    public Car() {
        tyres = 4;
        on = false;
        speed = 0;
    }

    // We can also implement Non-Abstract Methods in Abstract Class
    public void start() {
        on = true;
        System.out.println("Engine has turned On");
    }

    public void stop() {
        on = false;
        System.out.println("Engine has shut down");
    }

    public void speedUp(int upShift) {
        if (!on) {
            System.out.println("Please Start your Car in order to speedUp!");
        } else {
            speed += upShift;
        }
    }

    public void speedDown(int downShift) {
        if (!on) {
            System.out.println("Please Start your Car in order to speedDown!");
        } else {
            speed -= downShift;
        }
    }

    public void brake() {
        if (on)
            speed = 0;
        else
            System.out.println("Start the car first!");
    }

    // Abstract methods should only be declared in Abstract class only and later
    // implement all the methods in each of the Inherited Class
    abstract void Model();

    abstract void Year();

    abstract void KmsDriven();
}

class BMW extends Car {

    @Override
    void Model() {
        String model = "BMW M8 Competition";
        System.out.println("The Model of BMW: " + model);
    }

    @Override
    void Year() {
        int year = 2020;
        System.out.println("The Year of BMW: " + year);
    }

    @Override
    void KmsDriven() {
        int driven = 16000;
        System.out.println("The BMW is driven around " + driven + " Kms");
    }
}

class Audi extends Car {

    @Override
    void Model() {
        String model = "Audi R8 V10 Spyder";
        System.out.println("The Model of Audi: " + model);
    }

    @Override
    void Year() {
        int year = 2018;
        System.out.println("The Year of Audi: " + year);
    }

    @Override
    void KmsDriven() {
        int driven = 10000;
        System.out.println("The Audi is driven around " + driven + " Kms");
    }
}

class Porsche extends Car {

    @Override
    void Model() {
        String model = "Porsche 911 GT3";
        System.out.println("The Model of Porsche: " + model);
    }

    @Override
    void Year() {
        int year = 2023;
        System.out.println("The Year of Porsche: " + year);
    }

    @Override
    void KmsDriven() {
        int driven = 5000;
        System.out.println("The Porsche is driven around " + driven + " Kms");
    }
}

public class AbstractClasses {
    public static void main(String[] args) {

        // Testing BMW Car
        Car obj = new BMW(); // Dynamic Binding Technique
        obj.start();

        obj.speedUp(100);
        System.out.println("The Current Speed of BMW is " + obj.speed);

        obj.speedDown(20);
        System.out.println("The Current Speed of BMW is " + obj.speed);

        obj.stop();

        // Testing Audi Car
        Car obj2 = new Audi(); // Dynamic Binding Technique
        obj2.start();

        obj2.speedUp(100);
        System.out.println("The Current Speed of Audi is " + obj.speed);

        obj2.speedDown(20);
        System.out.println("The Current Speed of Audi is " + obj.speed);

        obj2.stop();

        // Testing Porsche Car
        Car obj3 = new Porsche(); // Dynamic Binding Technique
        obj3.start();

        obj3.speedUp(100);
        System.out.println("The Current Speed of Porsche is " + obj.speed);

        obj3.speedDown(20);
        System.out.println("The Current Speed of Porsche is " + obj.speed);

        obj3.stop();

        obj.Model();
        obj2.Model();
        obj3.Model();
    }
}