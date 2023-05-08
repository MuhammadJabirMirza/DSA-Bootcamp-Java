package assignment3;
import java.util.Scanner;
//1. Factorial Program In Java
public class InterQuestion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number to find factorial");
        int number= scanner.nextInt();
        int factorial =1;
        for(int i =number; i>0; i-- ){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
}
