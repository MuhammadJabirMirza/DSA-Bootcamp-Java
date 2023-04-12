//6. Input currency in rupees and output in USD.
import java.util.Scanner;
public class Assignment2Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter currency in rupees to convert it in dollar");
        float pkr = scanner.nextFloat();
        double converted = pkr/256;
        System.out.println("your result is "+ converted);

    }
}
