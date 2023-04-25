package assignment3;
import java.util.Scanner;
//1. Factorial Program In Java
public class InterQuestion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();
        int factorial =1;
        System.out.println("enter number to find factorial");
        for(int i =number; i>=1; i-- ){
            factorial = factorial*i;
            //number = i;
        }
        System.out.println(factorial);
    }
}
