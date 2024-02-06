class Cars {

    // Protected members can only be accessible within the class and its subclass
    protected int speed;
    protected int gear;

    // Constructor
    public Cars(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
        System.out.println("The Current Speed of the Car is: " + speed);
        System.out.println("The Current Gear of the Car is: " + gear);
    }

    // Methods of Parent Class
    public void SpeedUp(int val) {
        speed += val;
    }

    public void SpeedDown(int val) {
        speed -= val;
    }

    public void ShiftGearUp() {
        if (speed >= 180) {
            System.out.println(
                    "Currently the Speed is " + speed + " and we cant go any fats as this is the top speed ever");
        }
        if (speed > 40) {
            gear += 1;
            System.out.println("Car Shifted to 2nd Gear");
        } else {
            System.out.println("The Speed of the Car must be above 40 in order to shift to 2nd Gear");
        }
        if (speed > 80) {
            gear += 1;
            System.out.println("Car Shifted to 3rd Gear");
        } else if (speed > 120) {
            gear += 1;
            System.out.println("Car Shifted to 4th Gear");
        } else if (speed > 160) {
            gear += 1;
            System.out.println("Car Shifted to 5th Gear");
        }

    }

    public void ShiftGearDown() {
        gear -= 1;
    }

}

// Audi Class Derived from Cars
class Audi extends Cars {

    public String model = "Audi R8 V10 Spyder";
    public int year = 2020;

    public Audi(int speed, int gear) {
        super(speed, gear);
    }

    public void model() {
        System.out.println("The Model of the Car is " + model);
    }

    public void year() {
        System.out.println("The Year of the Car is " + year);
    }

}

// Merc Class Derived from Audi
class Merc extends Audi {

    public String model = "Mercedes Maybach S680 V8";
    public int year = 2022;

    public Merc(int speed, int gear) {
        super(speed, gear);
    }

    public void model() {
        System.out.println("The Model of the Car is " + model);
    }

    public void year() {
        System.out.println("The Year of the Car is " + year);
    }

}

// Main Class
public class Inheritance {
    public static void main(String[] args) {
        Merc obj = new Merc(10, 1);
        obj.SpeedUp(60);
        obj.ShiftGearUp();
        System.out.println(obj.speed);

        obj.SpeedUp(40);
        obj.ShiftGearUp();
        System.out.println(obj.gear);
        System.out.println(obj.year);
        System.out.println(obj.model);

        Audi obj2 = new Audi(10, 1);
        System.out.println(obj2.year);
        System.out.println(obj2.model);

        if (obj.speed > obj2.speed) {
            System.out.println("Mercedes Won");
        } else {
            System.out.println("Audi Won");
        }

    }
}
