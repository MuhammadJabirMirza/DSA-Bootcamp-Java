package Assignment4;
//Write a program to print the sum of two numbers entered by user by defining your own method.
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the numbers you want to add");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int Sum = sum(num1,num2);
        System.out.println(Sum);
    }
    public static int sum(int num1, int num2){


        System.out.print("The sum of two numbers is ");
        return num1+num2;
    }
}
