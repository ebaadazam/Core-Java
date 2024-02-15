enum Cars {
    Mercedes, BMW, Audi, Koeniggsegg, Pagani;
}

public class EnumInJava {
    public static void main(String[] args) {

        System.out.println(Cars.Audi); // Calling out the constants with their enum name i.e, Cars

        Cars objt = Cars.Koeniggsegg; // Initialiing obj of type Cars
        System.out.println(objt);

        System.out.println(objt.ordinal()); // Ouptut-3 because Koeniggsegg is at index 3

        // This will give us a list of all the constants in the Cars enum
        Cars[] arr = Cars.values();

        for (Cars c : arr) {
            System.out.println(c);
        }

        // enum with the example of If-Else
        Cars obj = Cars.Koeniggsegg;

        if (obj == Cars.Mercedes) {
            System.out.println("Luxury");
        } else if (obj == Cars.Audi) {
            System.out.println("Luxury And Fast");
        } else if (obj == Cars.BMW) {
            System.out.println("Fast");
        } else if (obj == Cars.Koeniggsegg) {
            System.out.println("Race Car");
        } else if (obj == Cars.Pagani) {
            System.out.println("Pure Beauty");
        }

        // enum with the example of switch case
        Cars obj2 = Cars.Pagani;

        switch (obj2) {
            case Mercedes:
                System.out.println("Luxury");
                break;

            case BMW:
                System.out.println("Fast");
                break;

            case Audi:
                System.out.println("Luxury and Fast");
                break;

            case Koeniggsegg:
                System.out.println("Race Car");
                break;

            case Pagani:
                System.out.println("Pure Beauty");
                break;

            default:
                System.out.println("Enter a valid constant");
                break;
        }

    }

}
