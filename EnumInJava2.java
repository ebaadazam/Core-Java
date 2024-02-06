enum Cars {
    Sedan(20000), Coupe(130000), SUV(300000);

    private int price;

    // Private Constructor
    private Cars(int price) {
        this.price = price;
    }

    // Setter and Getter for accessing price variable
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumInJava2 {
    public static void main(String[] args) {

        for (Cars obj : Cars.values()) {
            System.out.println(obj + ":" + obj.getPrice());
        }
    }
}
