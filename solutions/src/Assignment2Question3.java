import java.util.Scanner;
public class Assignment2Question3 {
    //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter principal amount");
        int principal = scanner.nextInt();
        System.out.println("Please enter time duration in months");
        int time = scanner.nextInt();
        System.out.println("Please enter Rate of interest");
        float rate = scanner.nextFloat();

        float simpleInterest = (principal* time* rate)/100;

        System.out.println("Simple interest is "+ simpleInterest);
    }
}
