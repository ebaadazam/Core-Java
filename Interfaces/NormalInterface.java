// NORMAL INTERFACE - an Interface with more than one method

// Interface named Bikes
interface Bikes {

    // Unimplemented Methods of the Bikes Interface which will be implemented in its
    // sub class
    // And Each extended class should have all the declared methods of the Interface
    // class
    void Brand();

    void Model();

    void Year();

    void KmsDriven();
}

// Yamaha Class implements the Bikes Interface
class Yamaha implements Bikes {
    public String brand = "Yamaha";
    public String model = "R15 V4";

    @Override
    public void Brand() {
        System.out.println("The Brand of the Bike is: " + brand);
    }

    @Override
    public void Model() {
        System.out.println("The Model of the Bike is: " + model);
    }

    @Override
    public void Year() {
        int year = 2023;
        System.out.println(brand + " " + model + "is " + year + " Registered");
    }

    @Override
    public void KmsDriven() {
        int kms = 15000;
        System.out.println(brand + " " + model + "is " + kms + " Kms Driven");
    }
}

// Kawasaki Class implements the Bikes Interface
class Kawasaki implements Bikes {
    public String brand = "Kawasaki Ninja";
    public String model = "Zx10r";

    @Override
    public void Brand() {
        System.out.println("The Brand of a Sports Bike is: " + brand);
    }

    @Override
    public void Model() {
        System.out.println("The Model of a Sports Bike is: " + model);
    }

    @Override
    public void Year() {
        int year = 2021;
        System.out.println(brand + " " + model + "is " + year + " Registered");
    }

    @Override
    public void KmsDriven() {
        int kms = 20000;
        System.out.println(brand + " " + model + "is " + kms + " Kms Driven");
    }
}

// The Main Class
public class Interfaces {
    public static void main(String[] args) {

        // Object Creation for SportsBike Class
        Yamaha obj = new Yamaha();
        obj.Brand();
        obj.Model();
        obj.Year();
        obj.KmsDriven();

        // Object Creation for SuperBike Class
        Kawasaki obj2 = new Kawasaki();
        obj2.Brand();
        obj2.Model();
        obj2.Year();
        obj2.KmsDriven();
    }

}
