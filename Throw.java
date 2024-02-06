public class Throw {

    // This divideNum method shows that this method might raise an exception called
    // ArithmeticException
    public int divideNum(int m, int n) throws ArithmeticException {
        return m / n;
    }

    public static void main(String[] args) {
        Throw obj = new Throw();

        try {
            int res = obj.divideNum(45, 1000);

            if (res <= 0) {
                throw new ArithmeticException();
            }

            System.out.println(res);
        }

        catch (ArithmeticException e) {
            System.out.println("\nNumber cannot be divided by 0");
        }

        finally {
            System.out.println("Rest of the code..");
        }
    }
}