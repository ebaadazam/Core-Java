// If we want to have inheritance but we want that not every class that extends the class should inherit like there should be
// limited class that should be inherited from it, that's where sealed classes come into picture

// Class Vehicle permits only Cars and Bikes Class
sealed class Vehicle permits Cars, Bikes {
    public void Config() {
        System.out.println("This is a Vehicle class where only Cars and Bikes are allowed!");
    }
}

// All inherited/permitted classes should either be declared as final, sealed or
// non sealed
final class Cars extends Vehicle {
    public void car() {
        System.out.println("This is a Car Type Vehicle");
    }
}

// All inherited/permitted classes should either be declared as final, sealed or
// non sealed
final class Bikes extends Vehicle {
    public void bike() {
        System.out.println("This is a Bike Type Vehicle");
    }
}

class Scooter {
    public void scooty() {
        System.out.println("This is a Scooter But not of type Vehicle");
    }
}

public class SealedClass {
    public static void main(String[] args) {

        // If we would create an instance of Vehicle Class then we wouldnt be able to
        // call car() and bike() methods of Car and Bike Class

        // Creating an instance of Car Class
        Cars obj = new Cars();
        obj.car(); // It can call the method of Car Class
        obj.Config(); // It can also called the method of Vehicle Class as Vehicle class permits Car
                      // Class

        // Creating an instance of Bike Class
        Bikes obj2 = new Bikes();
        obj2.bike(); // It can call the method of Bike Class
        obj.Config(); // It can also called the method of Vehicle Class as Vehicle class permits Bike
                      // Class

        Scooter obj3 = new Scooter();
        obj3.scooty(); // It can only call the method of Scooter Class itself as it is not extending
                       // the Vehicle Class
    }
}
