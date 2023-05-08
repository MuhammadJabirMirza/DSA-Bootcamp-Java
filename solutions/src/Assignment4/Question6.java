package Assignment4;
//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
import java.util.Scanner;
public class Question6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of radius");

        double radius = scanner.nextDouble();
        circumference(radius);
    }

    private static void circumference(double rad) {

        double circum= 2*3.14*rad;
        System.out.print("Circumference of a circle is "+ circum);
        
    }
}
