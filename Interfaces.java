// Interface named Bikes
interface Bikes {
    void brand();

    void model();
}

// SportsBike Class implements the Bikes Interface
class SportsBike implements Bikes {
    public String brand = "Yamaha";
    public String model = "R15 V4";

    @Override
    public void brand() {
        System.out.println("The Brand of a Sports Bike is: " + brand);
    }

    @Override
    public void model() {
        System.out.println("The Model of a Sports Bike is: " + model);
    }
}

// SuperBike Class implements the Bikes Interface
class SuperBike implements Bikes {
    public String brand = "Kawasaki Ninja";
    public String model = "Zx10r";

    @Override
    public void brand() {
        System.out.println("The Brand of a Sports Bike is: " + brand);
    }

    @Override
    public void model() {
        System.out.println("The Model of a Sports Bike is: " + model);
    }
}

// The Main Class
public class Interfaces {
    public static void main(String[] args) {

        // Object Creation for SportsBike Class
        SportsBike obj = new SportsBike();
        obj.brand();
        obj.model();

        // Object Creation for SuperBike Class
        SuperBike obj2 = new SuperBike();
        obj2.brand();
        obj2.model();
    }

}
