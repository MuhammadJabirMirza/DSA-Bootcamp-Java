package assignment3;
//23. Input a number and print all the factors of that number (use loops).
import java.util.Scanner;
public class Question23 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number to find all the factors");
        int num = scanner.nextInt();

        for(int i=1; i<=num; i++){
            if (((num % i) == 0)){
                System.out.print(i+" ");
            }
        }
    }

}
