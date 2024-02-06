// Every class in java extends the Object Class which is the super of all the classes
// Here we will talk about two methods of Object class i.e, equals() and hashcode()
// equals() method compares the hexadecimal value of two objects by default. If we want it to compare the two objects based on their 
// values then we need to overwrite the equals() and implement it again in our class.
// When we are overwriting the equals() then we must also be overriding the hascode() method of Object class
// As when we say two objects are equal then we meant their value and their hashcode should also be equal

class Laptop {

    String model;
    int price;

    // toString() method basically provides String representation
    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    // Hashcode() method
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    // Equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) // 'this' is the current obj of Student Class and 'obj' is the foreign object
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass()) // if the class type is not same then return false
            return false;

        // Explicit casting
        Laptop other = (Laptop) obj;

        // Comparing the two objects based on their model only
        // return (other.model == this.model);

        // Comparing the two objects based on both model as well as price
        if (model == null) {
            if (other.model != null)
                return false;
        }

        else if (!model.equals(other.model)) {
            return false;
        }

        if (price != other.price) {
            return false;
        }
        return true;
    }
}

public class ObjectClass {
    public static void main(String[] args) {

        // Create 1st obj
        Laptop obj = new Laptop();
        obj.model = "DELL";
        obj.price = 40000;

        // Create 2nd obj
        Laptop obj2 = new Laptop();
        obj2.model = "DELL";
        obj2.price = 40000;

        // Comparing the two objects based on their values
        boolean result = obj.equals(obj2);
        System.out.println(result);
    }

}
