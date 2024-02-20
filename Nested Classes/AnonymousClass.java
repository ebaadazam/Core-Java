// Functional Interface because anonymous class works only with the functional interface
interface Cars {
    void porsches();
}

public class AnonymousClass {
    public static void main(String[] args) {

        // Anonymous Inner class implementing interface
        Cars c = new Cars() {

            @Override
            public void porsches() {
                System.out.println("Porsche 911 GT3 Here");
            }
        };
        c.porsches();
    }
}
