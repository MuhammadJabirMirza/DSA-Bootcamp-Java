package Assignment2;

import java.util.Scanner;
/*Take name as input and print a greeting message for that particular name*/
public class Assignment2Question2 {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Welcome "+ name+ " how are you!");

    }

}
