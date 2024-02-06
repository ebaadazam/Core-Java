import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakeInput {
    public static void main(String[] args) throws NumberFormatException, IOException {

        System.out.println("Enter a number: ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int res = Integer.parseInt(bf.readLine());

        System.out.println(res);

        bf.close();
    }
}
