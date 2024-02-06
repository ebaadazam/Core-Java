// MULTIPLE INHERITANCE IN JAVA CAN ONLY BE ACHIEVED THROUGH INTERFACES

// Create two Interfaces that acts as the Parent Class for the Class that derived implementing the Interfaces

interface TwoWheeler {
    void applyBrake();

    void applySpeed();
}

interface FourWheeler {
    void canDrive();

    void canDrift();
}

class BMW implements TwoWheeler, FourWheeler {
    public int speed;

    public BMW(int speed) {
        this.speed = speed;
    }

    @Override
    public void applyBrake() {
        speed -= 10;
    }

    @Override
    public void applySpeed() {
        speed += 10;
    }

    @Override
    public void canDrive() {
        if (speed >= 20) {
            System.out.println("Car is being drived");
        } else {
            System.out.println("PLease make your Car Speed at least to 20 in order to drive it");
        }
    }

    @Override
    public void canDrift() {
        if (speed > 120) {
            System.out.println("Car can perform aggressive Drifts");
        } else {
            System.out.println("PLease make your Car Speed at least to 120 in order to perform a drift");
        }
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        BMW obj = new BMW(10);
        System.out.println("The Speed of the car is " + obj.speed);
        obj.canDrive();
        obj.applySpeed();
        obj.canDrive();

        System.out.println("The Speed of the car is " + obj.speed);
        obj.canDrift();

        for (int i = 0; i < 130; i++) {
            obj.applySpeed();
        }
        obj.canDrift();

    }
}
